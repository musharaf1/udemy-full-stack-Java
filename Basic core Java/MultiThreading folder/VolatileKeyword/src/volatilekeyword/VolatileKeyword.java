/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volatilekeyword;

import java.util.logging.Level;
import java.util.logging.Logger;


public class VolatileKeyword {
public static int flag = 0;
    
    public static void main(String[] args) {
        while(true){
        if(flag == 0){
            System.out.println("running");
        }else{break;
        }
        }
        
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VolatileKeyword.class.getName()).log(Level.SEVERE, null, ex);
                }
                VolatileKeyword.flag = 1;
                System.out.println("flag value updated ");
            }
        }).start();
    }
    
}
