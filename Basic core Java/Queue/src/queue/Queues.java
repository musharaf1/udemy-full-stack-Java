/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author musharaf
 */
public class Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(6);
        try{
            queue.remove();
        }catch(NoSuchElementException e1){
            System.out.println("Queue is empty");
        }
       try{ 
           queue.add(1);
         queue.add(2);
          queue.add(3);
           queue.add(4);
            queue.add(5);
             queue.add(6);
              queue.add(7);
       }catch(IllegalStateException e){
           System.out.println("queue is full");;
       }
            for(Integer queueList: queue){
                System.out.println(queueList);
            }
    }
    
}
