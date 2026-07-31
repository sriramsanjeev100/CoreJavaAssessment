package MultiThreading.CompletableFuture.StudentMarks;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class StudentAverage
{
    public static void main(String[] args)
    {
        CompletableFuture<List<Integer>> marksFuture =
                CompletableFuture.supplyAsync(() ->
                {
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    return Arrays.asList(85, 90, 78, 88, 92);
                });

        System.out.println("Teacher is preparing the attendance......");

        CompletableFuture<Void> averageFuture =
                marksFuture
                        .thenApply(marks ->
                                marks.stream()
                                        .mapToInt(Integer::intValue)
                                        .average())
                        .thenAccept(average ->
                                System.out.println("Average Marks : " + average));

        averageFuture.join();
    }
}