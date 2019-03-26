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



public class Flight {
    private int passangers, seats = 150, flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable;
    
     {
        for(int i = 0; i<seats; i++){
            isSeatAvailable[i]=true;
        }
    
    }
     public Flight(){}
     
    public Flight(int passangers){
    this.passangers = passangers;
    }
    
    public Flight(int passangers,int seats){
    this.seats = seats;}
    
    

public  void addPassangers(){
    if(passangers<seats){
    passangers += 1;
    
    }else{
    handleTooMany();
    }
}
private void handleTooMany(){
    System.out.println("Too many");
}


public boolean hasRoom(Flight f2){
    int total = passangers + f2.passangers;
    
        return total<=seats;
        
        }
        
public Flight createNewWithBoth(Flight f2){
    Flight newFlight = new Flight();
    newFlight.seats = seats;
    newFlight.passangers = passangers + f2.passangers;
    return newFlight;
}

}
