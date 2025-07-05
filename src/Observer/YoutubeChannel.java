package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{
    private String channelName;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public YoutubeChannel (String channelName)
    {
        this.channelName=channelName;
    }

    @Override
    public void subscribe(Subscriber obj) {
        subscriberList.add(obj);
    }

    @Override
    public void unsubscribe(Subscriber obj) {
        subscriberList.remove(obj);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for(Subscriber s : subscriberList)
        {
            s.update(channelName,videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}
