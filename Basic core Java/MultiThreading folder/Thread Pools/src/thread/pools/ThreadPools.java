/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;




public class ThreadPools extends Thread {
     private String name;

    public ThreadPools(String name) {
        this.name = name;
    }
     @Override
    public void run(){
         System.out.println("starting thread: "+name);
         
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println("thread ended "+ name);
    };
     
        
    
    public static void main(String[] args) {
        ExecutorService executorServices = Executors.newFixedThreadPool(2); //creating a thread pool
        Thread thread1 = new Thread(new ThreadPools("thread 1"));
        Thread thread2 = new Thread(new ThreadPools("thread 2"));
        Thread thread3 = new Thread(new ThreadPools("thread 3"));
        Thread thread4 = new Thread(new ThreadPools("thread 4"));
        Thread thread5 = new Thread(new ThreadPools("thread 5"));
        Thread thread6 = new Thread(new ThreadPools("thread 6"));
         Thread thread7 = new Thread(new ThreadPools("thread 7"));
        Thread thread8 = new Thread(new ThreadPools("thread 8"));
        Thread thread9 = new Thread(new ThreadPools("thread 9"));
        Thread thread10 = new Thread(new ThreadPools("thread 10"));
        Thread thread11 = new Thread(new ThreadPools("thread 11"));
        Thread thread12= new Thread(new ThreadPools("thread 12"));
        Thread thread13 = new Thread(new ThreadPools("thread 13"));
         Thread thread14 = new Thread(new ThreadPools("thread 14"));
        Thread thread15 = new Thread(new ThreadPools("thread 15"));
        Thread thread16 = new Thread(new ThreadPools("thread 16"));
        
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();
//        thread9.start();
//        thread10.start();
//        thread11.start();
//        thread12.start();
//        thread13.start();
//        thread14.start();
//        thread15.start();
//        thread16.start();
        executorServices.execute(thread1);
        executorServices.execute(thread2);
        executorServices.execute(thread3);
        executorServices.execute(thread4);
/*        executorServices.execute(thread5);
        executorServices.execute(thread6);
        executorServices.execute(thread7);
        executorServices.execute(thread8);
        executorServices.execute(thread9);
        executorServices.execute(thread10);
        executorServices.execute(thread11);
        executorServices.execute(thread12);
        executorServices.execute(thread13);
        executorServices.execute(thread14);
        executorServices.execute(thread15);
        executorServices.execute(thread16);
        
        */ 
executorServices.shutdown();
    }
    
}
