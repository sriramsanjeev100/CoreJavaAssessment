package MultiThreading.ConcurrentCollections.ChatApplication;

import java.util.concurrent.ConcurrentHashMap;

public class ChatRoom
{
    private ConcurrentHashMap<String, String> activeUsers = new ConcurrentHashMap<>();

    public void joinChat(String userName)
    {
        activeUsers.put(userName, "Online");
        System.out.println(userName + " joined the chat.");
    }

    public void leaveChat(String userName)
    {
        activeUsers.remove(userName);
        System.out.println(userName + " left the chat.");
    }

    public void sendMessage(String userName, String message)
    {
        if (activeUsers.containsKey(userName))
        {
            System.out.println(userName + " : " + message);
        }
        else
        {
            System.out.println(userName + " is not in the chat room.");
        }
    }

    public void displayUsers()
    {
        System.out.println("\n===== Active Users =====");

        for (String user : activeUsers.keySet())
        {
            System.out.println(user);
        }
    }
}