package MultiThreading.AtomicVariables.GameScoreBoard;

import java.util.concurrent.atomic.AtomicInteger;

public class GameScore
{
    private AtomicInteger score = new AtomicInteger(0);

    public void updateScore(String playerName, int points)
    {
        int updatedScore = score.addAndGet(points);
        System.out.println(playerName + " scored " + points + " points.");
        System.out.println("Current Score : " + updatedScore);
        System.out.println();
    }

    public int getScore()
    {
        return score.get();
    }
}