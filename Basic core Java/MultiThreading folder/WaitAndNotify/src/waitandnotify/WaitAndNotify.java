/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitandnotify;

// the wait and notify method is useful when we have dependencies of multiThreads.

//when threads depends on each/one another

public class WaitAndNotify {
    
    static public int balance = 0;
    public void withdraw(int amt){
        synchronized(this) {
            if(balance <=0 ){
                try {
                    System.out.println("waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                balance = balance - amt;
                System.out.println("withdrawal successful and the current balance "+balance);
            }
        }
    }
    public void deposit(int amt){
        System.out.println("we are depositing an amount");
    balance = balance + amt;
    synchronized(this){notify();}
    }
   
    public static void main(String[] args) {
        WaitAndNotify app = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.withdraw(1000);
            }
        });
        thread1.setName("thread1");
        thread1.start();
        
        
        Thread thread2 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                app.deposit(2000);
            }
            
        });
        thread2.setName("thread 2");
        thread2.start();
    }
    
}
