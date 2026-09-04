package javaprograms.multithreading;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool
{
    public static void main(String[] args) {
        //ExecutorService executorService= Executors.newFixedThreadPool(3);
        //ExecutorService executorService= Executors.newCachedThreadPool();
        //ExecutorService executorService= Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(()-> System.out.println("Executed after 5 seconds"),5, TimeUnit.SECONDS);
//        for (int i=1;i<=5;i++)
//        {
//            int taskId=i;
//            executorService.execute(()->{
//                System.out.println("task "+taskId+" executed by "+Thread.currentThread().getName());
//            });
//        }
    }
}
