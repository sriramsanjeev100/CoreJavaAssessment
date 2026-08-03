package MultiThreading.ConcurrentCollections.ChatApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ChatMain
{
    public static void main(String[] args)
    {
        ChatRoom chatRoom = new ChatRoom();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(() ->
        {
            chatRoom.joinChat("Sriram");
            chatRoom.sendMessage("Sriram", "Hello Everyone.");
        });

        executor.execute(() ->
        {
            chatRoom.joinChat("Leo");
            chatRoom.sendMessage("Leo", "Hi Guys");
        });

        executor.execute(() ->
        {
            chatRoom.joinChat("John");
            chatRoom.sendMessage("John", "Good Morning");
            chatRoom.leaveChat("John");
        });

        executor.execute(() ->
        {
            chatRoom.joinChat("Aaron");
            chatRoom.sendMessage("Aaron", "How are you?");
        });

        executor.shutdown();

        try
        {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        chatRoom.displayUsers();
    }
}