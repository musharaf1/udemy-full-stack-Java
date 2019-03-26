/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pluralsiteproject;

/**
 *
 * @author musharaf
 */
public class PluralsiteProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        
        Flight flight3 = null;
        
        if(flight1.hasRoom(flight2)){
        flight3 = flight1.createNewWithBoth(flight2);
        
        }
        
    }
    
}
