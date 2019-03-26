/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author musharaf
 */
public class Synchronization1 {

    public static int count = 0;
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
             for(int i = 0; i<+1000; i++){
                 Synchronization1.count++;
             }
             System.out.println("the loop in thread 1 is over");
            }
        });
            
         Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
             for(int i = 0; i<+1000; i++){
                 Synchronization1.count++;
             }
                System.out.println("the loop in thread 2 is over");
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println("the value of counter is "+Synchronization1.count);
     
    }
    
}
