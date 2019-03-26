/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.down.latches;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
 class SomeThread extends Thread{
 private CountDownLatch latch;

    public SomeThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("thread running with threa name "+ Thread.currentThread().getName());
        System.out.println("thread execution complete");
        System.out.println("****************************");
        latch.countDown();
    }
 
 
 }
public class App extends Thread {
   
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        try {
            latch.await(); // await method forces the main thread to wait until other threads are executed
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("i am in main thread "+Thread.currentThread().getName());
    }
    
}
