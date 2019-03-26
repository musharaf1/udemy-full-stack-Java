/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interupts;



public class Interupts {
    public static int balance = 0;
    
    public void withdraw(int amt){
       synchronized(this){
           if(balance <= 0){
                try {
                    System.out.println("waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("thread got interrupted");
                     balance = balance - amt;
                System.out.println("withdrawal successful! and new balance is: "+ balance);
                    
                    
                }
               
            }
        }
    
    }
    public void deposite(int amt){
        System.out.println("we are depositing");
        balance = balance + amt;
        
        }
    
    public static void main(String[] args) {
        Interupts app = new Interupts();
      Thread thread1 = new Thread( new Runnable(){
          @Override
          public void run() {
              app.withdraw(1000);
             
          }
      });
      thread1.start();
      
      
      Thread thread2 = new Thread( new Runnable(){
          @Override
          public void run() {
              try {
                  Thread.sleep(5000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              app.deposite(2000);
              thread1.interrupt();
          }
      });
      thread2.start();
    }
    
}
