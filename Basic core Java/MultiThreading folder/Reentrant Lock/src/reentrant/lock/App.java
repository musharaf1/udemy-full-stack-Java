/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reentrant.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author musharaf
 */

// to avoid the inconsitency encountered by the threads as they try to execute simultaneously, we make use of REENTRANT LOCK
public class App {
    static int counter = 0;
    static Lock lock = new ReentrantLock();
    
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                lock.lock(); // the root cause of the interferance is the common code which is the
                try{          //we must ensure that the code between the lock() and unlock() is put inside a try block to avoid deadlock
                for(int i = 0; i<1000; i++){
                    App.counter++;
                   
                }
                }finally{
                lock.unlock();
            }
            }
        });
        
         Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                lock.lock(); // the root cause of the interferance is the common code which is the
                try{
                for(int i = 0; i<1000; i++){
                    App.counter++;
                    
                }}finally{
                lock.unlock();
            }}
        });
         
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
         System.out.println("final value of count: "+App.counter);
    }
    
}
