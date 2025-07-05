package Observer;

public class YoutubeUser implements Subscriber{
    private String userName;

    public YoutubeUser(String userName)
    {
        this.userName=userName;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(userName + " got notified: " + channelName + " uploaded \"" + videoTitle + "\"");
    }
}
