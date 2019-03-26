/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronisation2;

/**
 *
 * @author musharaf
 */

class Bracket{

    synchronized public void generate(){
    for(int i =0; i<=10; i++){
        if(i<=5){
            System.out.print("[");
        }
        else{System.out.print("]");
        }
    }System.out.println();
    
    }
}
public class Synchronisation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        
        new Thread(new Runnable(){
            @Override
            public void run() {
                   for(int i = 0; i<=5; i++){
                    bracket.generate();
                   }
            }
        }).start();
        
         new Thread(new Runnable(){
            @Override
            public void run() {
                   for(int i = 0; i<=5; i++){
                    bracket.generate();
                   }
            }
        }).start();
       
    }
    
}
