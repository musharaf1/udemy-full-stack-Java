/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syncblock;

import java.util.logging.Level;
import java.util.logging.Logger;

class Bracket{
private Object lock = "lock";
     public void generate(){
        synchronized(lock){
        for(int i =0; i<=10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bracket.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i<=5){
                System.out.print("[");
            }
            else{System.out.print("]");
            }
        }System.out.println();
        }
        for(int i = 0; i<=5; i++){
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bracket.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }

    
    }
    /*
    * Synchronized method approach
    *Time required 
    *Synchronized block approach
    *Time required 
    
    
    */
}
public class SyncBlock {

    
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        
        new Thread(new Runnable(){
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                   for(int i = 0; i<=5; i++){
                    bracket.generate();      
                   }
                   long endTime = System.currentTimeMillis();
                   System.out.println("time required for thread 1 was "+(endTime-startTime));
            }
        }).start();
        
         new Thread(new Runnable(){
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                   for(int i = 0; i<=5; i++){
                    bracket.generate();
                   }
                   long endTime = System.currentTimeMillis();
                  System.out.println("time required for thread 1 was "+(endTime-startTime));
            }
        }).start();
       
    }
    
}
