package CollectionsPackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class MusicPlaylistManager
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Deque<String> playlist = new ArrayDeque<>();

        playlist.addFirst("Etho Mazhayil");
        playlist.addFirst("Payye Veeshum");
        playlist.addFirst("Vaathil Melle");

        playlist.addLast("Kesariya");
        playlist.addLast("Ishq Wala Love");
        playlist.addLast("Chaand Sifarish");

        System.out.println("=== Play next song (remove from front) ===");
        System.out.println("Playing Next Song : " + playlist.pollFirst());
        System.out.println();

        System.out.println("=== Play last song (remove from rear) ===");
        System.out.println("Playing Last Song : " + playlist.pollLast());
        System.out.println();

        System.out.println("=== View next song ===");
        System.out.println("Next Song : " + playlist.peekFirst());
        System.out.println();

        System.out.println("=== View last song ===");
        System.out.println("Last Song : " + playlist.peekLast());
        System.out.println();

        System.out.println("=== Display all songs ===");
        for (String song : playlist)
        {
            System.out.println(song);
        }
        System.out.println();

        System.out.println("=== Display all songs in reverse order ===");
        System.out.println("Songs in Reverse Order");
        Iterator<String> itr = playlist.descendingIterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();

        System.out.println("=== Search for a song ===");
        System.out.print("Enter song to search: ");
        String searchSong = sc.nextLine();
        if (playlist.contains(searchSong))
        {
            System.out.println("Song Found");
        }
        else
        {
            System.out.println("Song Not Found");
        }
        System.out.println();

        System.out.println("=== Count total songs ===");
        System.out.println("Total Songs : " + playlist.size());
        System.out.println();

        System.out.println("=== Playlist Before Clearing ===");
        for (String song : playlist)
        {
            System.out.println(song);
        }
        System.out.println();

        System.out.println("=== Playlist After Clearing ===");
        playlist.clear();
        for (String song : playlist)
        {
            System.out.println(song);
        }
    }
}
