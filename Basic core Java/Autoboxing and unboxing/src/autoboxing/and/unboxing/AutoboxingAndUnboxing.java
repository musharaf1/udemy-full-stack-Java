/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxing.and.unboxing;

import java.util.ArrayList;

/**
 *
 * @author musharaf
 */
    class intWrapper{
        int num;
    intWrapper(int num){
    this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    }
public class AutoboxingAndUnboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* ArrayList<Integer> names;
        
        names = new ArrayList<>();
        names.add(23); //Autoboxing
        names.add(24);
        names.add(25);
        names.add(26);
        names.add(27);
        
        AutoboxingAndUnboxing app = new AutoboxingAndUnboxing();
        app.displayNumber(names);
    }
    public void displayNumber(ArrayList<Integer> list){
        list.forEach((Numbers) -> {
            System.out.println(Numbers);
        });
    */
       ArrayList<intWrapper> numbers = new ArrayList<>();
       numbers.add(new intWrapper(23));  //boxing
       numbers.add(new intWrapper(24));
       numbers.add(new intWrapper(25));
       
        System.out.println(numbers.get(1));
        System.out.println("***********************");
       
       AutoboxingAndUnboxing app = new AutoboxingAndUnboxing();
       app.displayNumbers(numbers);
        System.out.println("*************************");
        AutoboxingAndUnboxing app1 = new AutoboxingAndUnboxing();
        System.out.println(app.getClass());
       
    }
    public void displayNumbers(ArrayList<intWrapper> numb){
    
        numb.forEach((numbs) -> {
            System.out.println(numbs);
        });
    }
}
