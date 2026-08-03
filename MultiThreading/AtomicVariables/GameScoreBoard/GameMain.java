package MultiThreading.AtomicVariables.GameScoreBoard;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GameMain
{
    public static void main(String[] args)
    {
        GameScore game = new GameScore();

        System.out.println("===== Live Game Scoreboard =====");
        System.out.println("Initial Score : " + game.getScore());
        System.out.println();

        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(() ->
        {
            game.updateScore("Sriram", 10);
        });

        executor.execute(() ->
        {
            game.updateScore("Leo", 15);
        });

        executor.execute(() ->
        {
            game.updateScore("John", 20);
        });

        executor.execute(() ->
        {
            game.updateScore("Aaron", 25);
        });

        executor.shutdown();

        try
        {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("===== Match Over =====");
        System.out.println("Final Score : " + game.getScore());
    }
}