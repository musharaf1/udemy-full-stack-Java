/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableinterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author musharaf
 */
class name implements Comparable<name>{
    private  String newName;

    public name(String newName) {
        this.newName = newName;
    }

    @Override
    public int compareTo(name obj) {
        if(newName.length()== obj.newName.length()){
        
        return 0;
        }else if(newName.length()< obj.newName.length()){
        
        return -1;
        }
        
        
       return 1; 
    }

    @Override
    public String toString() {
        return newName;
    }
    
    


}
public class ComparableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<name> names = new LinkedList<>();
        names.add( new name("one"));
        names.add( new name("two"));
        names.add( new name("three"));
        names.add( new name("four"));
        names.add( new name("five"));
        
        ComparableInterface app = new ComparableInterface();
        app.printList(names);
        System.out.println("********************");
        
        Collections.sort(names);
        app.printList(names);
        
        
        
       
        
        
        
        
        
        
        
       
    }
    
   void printList(List<name> iter){
  java.util.Iterator<name> iterator = iter.iterator();
  while(iterator.hasNext()){
      System.out.println(iterator.next());
  }
    
    
    }
    
}
