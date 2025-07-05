import Observer.Subscriber;
import Observer.YoutubeChannel;
import Observer.YoutubeUser;

public class ObserverMain {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome to Observer Main!\n");

        YoutubeChannel channel = new YoutubeChannel("YesTheory");

        Subscriber user1= new YoutubeUser("Amlan");
        Subscriber user2= new YoutubeUser("Anisha");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("First Video");

        channel.unsubscribe(user2);

        channel.uploadVideo("Second Video");

    }
}
