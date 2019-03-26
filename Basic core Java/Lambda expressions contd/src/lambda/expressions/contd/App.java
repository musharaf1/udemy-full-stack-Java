/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.expressions.contd;

// without parameter
interface Lambda{
    abstract public void demo( );
    }
// with parameter
interface Lambda1{
    abstract public void demo(int y );
    }
// with parameter and return type
interface Lambda2{
    abstract public int demo(int z );
    }

public class App {
    
    public static void main(String[] args) {
        int x = 20;
       Lambda lambda =  ()->{System.out.println("the value of x "+ x);
           System.out.println("statement from demo method");
       
       };
       lambda.demo();
       
       Lambda1 lambda1 =  (int y)->{
           System.out.println("value of lambda y "+y);
       };
       lambda1.demo(20);
       
       Lambda2 lamda2 = (int z)->{
           return (z/100);
       };
        System.out.println("the return value is : "+lamda2.demo(1000));
       
       
    }
    
}
