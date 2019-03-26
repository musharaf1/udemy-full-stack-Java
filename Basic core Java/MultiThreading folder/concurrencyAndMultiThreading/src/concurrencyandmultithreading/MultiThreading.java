/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencyandmultithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author musharaf
 */
 class myCounter extends Thread{
     private int threadNo;
    public myCounter(int threadNo) {
        this.threadNo = threadNo;
    }
        
         public void countMe(){
         for(int i = 1; i<=9; i++){
             System.out.println("the value of i is: "+i+" and the thread number is: "+threadNo);
             try {
                 sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         }
     @Override
         public void run(){
         countMe();
         }
    
    }
public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        myCounter counter1 = new myCounter(1);
        myCounter counter2 = new myCounter(2);
        counter1.start();
        System.out.println("*******************************");
        counter2.start();
        Thread.sleep(4505);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required to process: "+(endTime-startTime));
    }
    
}
