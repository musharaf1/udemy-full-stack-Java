/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author musharaf
 */

class MyCounter implements Runnable{
        private int threadNo;
        
        MyCounter(int threadNo){
        this.threadNo = threadNo;
        }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i<=9;i++){
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException ex) {
                Logger.getLogger(MyCounter.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("the value of i is: "+i+"and the thread number is: "+threadNo);}
    }

   
        
    }
public class MultiThreading {
    public static void main(String[] args) {
      /* Thread thread1 = new Thread(new MyCounter(1));
       Thread thread2 = new Thread(new MyCounter(2));
       thread1.start(  );
       thread2.start();
*/
     Thread thread = new Thread(new Runnable(){
          @Override
          public void run() {
              for(int i =0; i<=9; i++){
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  System.out.println(i);}
          }
      }); 
     thread.start(); 
    }

    
}
