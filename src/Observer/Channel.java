package Observer;

public interface Channel {

    void subscribe(Subscriber obj);
    void unsubscribe(Subscriber obj);
    void notifySubscribers(String videoTitle);
}
