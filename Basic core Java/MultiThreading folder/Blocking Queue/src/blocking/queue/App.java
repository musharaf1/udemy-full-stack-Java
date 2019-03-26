/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocking.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
   Blocking queue is a thread safe collection: capable of handling multiple threaded operation 
 */

class Producer implements Runnable{
   private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
   
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                queue.put(App.count++);
                System.out.println("value added in the queue: "+ App.count);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }        
    }
}

class Consumer implements Runnable{
   private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
   
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000);
                queue.take();
                App.count--;
                System.out.println("value removed  in the queue: "+ App.count);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }        
    }
}
public class App {
 static int count = 0;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer produce = new Producer(queue);
        Thread producerThread = new Thread(produce);
        
        producerThread.start();
        
    Consumer consumes = new Consumer(queue);
    Thread consumerThread = new Thread(consumes);
    consumerThread.start();
    }
    
}
