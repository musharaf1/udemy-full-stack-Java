/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author musharaf
 */
public class classInner {
     Lock lock;
     
     
      public  classInner(){
    lock = new Lock(true );
    }
       
     
    
     public class Lock{
        private boolean lock;
        
        public Lock( boolean lock){
        this.lock = lock;
        }
        
        public boolean getLock(){
        return lock;
        }
        
        public void setLock(boolean lock){
            this.lock = lock;
        }
        
  
    }
    
    }
     
    


