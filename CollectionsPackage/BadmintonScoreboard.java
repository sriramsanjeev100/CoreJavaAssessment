package CollectionsPackage;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BadmintonScoreboard
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,String> scoreboard=new TreeMap<Integer,String>();

        scoreboard.put(21, "Rahul");
        scoreboard.put(18, "Anu");
        scoreboard.put(15, "Vivek");
        scoreboard.put(12, "Meera");

        System.out.println("===== Initial Scoreboard =====");
        for (Map.Entry<Integer,String> entry:scoreboard.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        System.out.println("===== Adding a Player =====");
        System.out.println("Enter Player Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Score : ");
        int score = sc.nextInt();
        sc.nextLine();
        scoreboard.put(score, name);
        System.out.println();

        System.out.println("===== Update Player Score =====");
        System.out.print("Enter Player Name to Update : ");
        name = sc.nextLine();
        System.out.print("Enter New Score : ");
        int newScore = sc.nextInt();
        sc.nextLine();
        Integer oldScore = null;

        for (Map.Entry<Integer, String> entry : scoreboard.entrySet())
        {
            if (entry.getValue().equalsIgnoreCase(name))
            {
                oldScore = entry.getKey();
                break;
            }
        }

        if (oldScore != null)
        {
            scoreboard.remove(oldScore);
            scoreboard.put(newScore, name);
            System.out.println("Player Score Updated");
        }
        else
        {
            System.out.println("Player Not Found");
        }
        System.out.println();

        System.out.println("===== Removing Player =====");
        System.out.print("Enter Player Name to Remove: ");
        name = sc.nextLine();
        Integer removeScore=null;

        for (Map.Entry<Integer,String> entry:scoreboard.entrySet())
        {
            if (entry.getValue().equalsIgnoreCase(name))
            {
                removeScore = entry.getKey();
                break;
            }
        }
        if (removeScore != null)
        {
            scoreboard.remove(removeScore);
            System.out.println("Player Removed");
        }
        else
        {
            System.out.println("Player Not found");
        }
        System.out.println();

        System.out.println("===== Leaderboard (Highest to Lowest) =====");
        for (Map.Entry<Integer,String> entry:scoreboard.descendingMap().entrySet())
        {
            System.out.println(entry.getKey()+" ----> "+entry.getValue());
        }
        System.out.println();

        System.out.println("===== Display players with scores above a given value =====");
        System.out.print("Enter Minimum Score : ");
        int minScore = sc.nextInt();
        for (Map.Entry<Integer,String> entry:scoreboard.tailMap(minScore,false).entrySet())
        {
            System.out.println(entry.getKey()+" ----> "+entry.getValue());
        }
        System.out.println();

        System.out.println("===== Highest Scoring Player =====");
        System.out.println(scoreboard.lastEntry().getKey() + " ----> " + scoreboard.lastEntry().getValue());
        System.out.println();

        System.out.println("===== Lowest Scoring Player =====");
        System.out.println(scoreboard.firstEntry().getKey() + " ----> " + scoreboard.firstEntry().getValue());
        System.out.println();

        System.out.println("===== 2nd Highest Scoring Player =====");
        System.out.println("Score Below Highest ----> " + scoreboard.lowerKey(scoreboard.lastKey()));
        System.out.println();

        System.out.println("===== 2nd Lowest Scoring Player =====");
        System.out.println("Score Above Lowest ----> " + scoreboard.higherKey(scoreboard.firstKey()));
        System.out.println();

        System.out.println("===== Display all players within a score range using subMap(). =====");
        System.out.print("Enter Start Score : ");
        int startScore = sc.nextInt();
        System.out.print("Enter End Score : ");
        int endScore = sc.nextInt();
        for  (Map.Entry<Integer,String> entry:scoreboard.subMap(startScore,endScore).entrySet())
        {
            System.out.println(entry.getKey()+" ----> "+entry.getValue());
        }
        System.out.println();

        System.out.println("===== Total number of distinct score groups.. =====");
        System.out.println("Total Distinct Score Groups :"+scoreboard.size());
    }
}
