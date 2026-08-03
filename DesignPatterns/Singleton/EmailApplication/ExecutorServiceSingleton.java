package DesignPatterns.Singleton.EmailApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSingleton
{
    private static ExecutorService executor = Executors.newFixedThreadPool(4);

    private ExecutorServiceSingleton()
    {

    }

    public static ExecutorService getExecutor()
    {
        return executor;
    }
}