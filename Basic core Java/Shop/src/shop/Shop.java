/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author musharaf
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Door door = new Door();
        
        ArrayList<String> list= new ArrayList<>();
        
        list.add("i\'m musharaf ");
        list.add("i\'m  a mobile software developer ");
        list.add("i\'m also a full stack  java developer");
        
        System.out.println(list);
        System.out.println("**************************");
        
       /* //  LIST INTERFACE
        
        List<String> names = new LinkedList<>();
        names.add("one");
        System.out.println(names.get(0));
        
        System.out.println("*******************");
        List<String> name = new ArrayList<>();
        names.add("one");
        System.out.println(names.get(0));
        */
       /*
       // ITERABLE CLASS: principle behind loops
       
       List<String> names = new LinkedList<>();
        names.add("one");
        names.add("two");
        names.add("three");
        names.add("four");
        names.add("five");
        
        printList(names);
        */
       
       // SORTING AND REVERSAL
        System.out.println("*****************");
        List<String> names = new LinkedList<>();
        names.add("one");
        names.add("two");
        names.add("three");
        names.add("four");
        names.add("five");
        names.sort(null);
        
        System.out.println(names);
        System.out.println("*******************");
        // REVERSAL
        
        Collections.reverse(names);
        System.out.println(names);
        int result;
        System.out.println("*******************");
        // compareTo
        List<String> comp = new LinkedList<>();
        comp.add("a");
        result = comp.get(0).compareTo("a");
        System.out.println(result);
        
       
        
      //  System.out.println(new Door().Arraylist());
        
       
//        System.out.println(" is the door looked? " +new Door().isLocked("Authority"));
//        System.out.println(new Door().Adder(123));
        
        
    }
   
  static void printList(List<String> iter){
  Iterator<String> iterator = iter.iterator();
  while(iterator.hasNext()){
      System.out.println(iterator.next());
  }
          
  
  }
    
}