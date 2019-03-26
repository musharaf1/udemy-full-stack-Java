/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
NB: using the synchronized block can lead to deadlock scenario: as shown below 
*/
public class App {

    static String lock1 = "lock1";
    static String lock2 = "lock2";
    
    public static void main(String[] args) {
        
       Thread thread1 = new Thread(new Runnable(){
           @Override
           public void run() {
               synchronized(lock1){System.out.println("on thread1 with lock2");
                synchronized(lock2){System.out.println("on thread1 with lock1");}
               }
              
           }
       });
       
       
       
       Thread thread2 = new Thread(new Runnable(){
           @Override
           public void run() {
               synchronized(lock2){System.out.println("on thread2 with lock2");
               synchronized(lock1){System.out.println("on thread2 with lock1");}
               }
               
               
           }
       });
       
       thread1.start();
       thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("inside main thread "+Thread.currentThread().getName());
    }
    
    
    
}
