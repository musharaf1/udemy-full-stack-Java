/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package join.method;

import java.util.logging.Level;
import java.util.logging.Logger;


public class JoinMethod {
    public  int counter = 0;
    public static void main(String[] args) {
        JoinMethod app = new JoinMethod();
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i =0; i<1000; i++){
                app.counter++;
                
                }
            }
        });
        
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    thread1.join();
                    for(int i =0; i<1000; i++){
                        app.counter++;
                        
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(JoinMethod.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(" the value of counter: "+app.counter);
    }
    
}
 