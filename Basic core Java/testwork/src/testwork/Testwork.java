/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Testwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        int x = sc.nextInt();
        System.out.println("input y");
        int y = sc.nextInt();
        System.out.println("enter an operator");
        String operator = sc.next();
        
        if(operator.equals("+")){
            System.out.println("this is addition " + x+y);}
        
        else if(operator.equals("*")){
            System.out.println("this is multiplication " + x*y);}
        
        else if(operator.equals("/")){
            System.out.println("this is division " + x/y);}
        
        else{
            System.out.println("you have not entered a valid option");}
       
      */
       
       
       for(int row = 0; row < 5; row++){
           System.out.print("row " +row +" : ");
           
           for(int col = 0; col <5; col++){
               System.out.print(col+ " ");}
           
               System.out.println("   ");
       }
       
       
       int v = 0;
       while(v<10){System.out.print(v);}
        System.out.println("-----------------------------------");
        
        for(int i = 0; i < 4; i++){
       
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    
}
