/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author musharaf
 */
 class Data<K,V>{
 private K key;
 private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" + "key=" + key + ", value=" + value + '}';
    }
 
 
 }
     
public class Sets {
    public static void main(String[] args) {
        /*
      // there are three types 1.HashSet 2.LinkedSet 3.TreeSet
      Set<String> number = new TreeSet<>();
      for(int i = 30; i>0; --i){
      number.add("A"+i);
      }
      for(String  numbs: number){
          System.out.println(numbs);}
*/
        Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer,String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
                if(obj1.getKey() < obj2.getKey()){
                return -1;
                }else if(obj1.getKey() > obj2.getKey()){
                return 1;
                        }else
                return 0;
            }
            
        };
        Set<Data<Integer, String >> set = new TreeSet<>(COMPARE_KEY);
        set.add(new Data(1, "one"));
        set.add(new Data(2, "two"));
        set.add(new Data(3, "three"));
        set.add(new Data(4, "four"));
        set.add(new Data(5, "five"));
        for(Data data:set){
        
            System.out.println(data);}
    }
    
     }
 

