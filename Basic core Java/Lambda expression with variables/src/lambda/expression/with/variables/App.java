/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.expression.with.variables;

import java.util.ArrayList;
import java.util.List;

 class Data{

    
 private String name;

    public Data(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
 
    @Override
    public String toString() {
        return "Data{" + "name=" + name + '}';
    }
 }
public class App {

    
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(23);
       list.add(24);
       list.add(25);
       list.add(26);
       list.add(27);
       list.add(28);
       
      // for(Integer num: list){System.out.println(num);}
       
       // using Lambda expression inside of the enhanced for loop
       list.forEach(num->{
           if(num > 25){
           System.out.println(num);
           }
       });
       
       
       List<Data> names = new ArrayList<>();
       names.add(new Data("musharaf"));
       names.add(new Data("Nusirat"));
       names.add(new Data("Adisa"));
       names.add(new Data("Ajike"));
       
       names.forEach(ourNames->{ 
           System.out.println("you know who we are ? we are "+ourNames.getName());
       });
       
    }
    
}
