/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package working.on.debugger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author musharaf
 */
public class App {

    
    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        double s, a,b,S,average;
        
       /* S = 0d;
        System.out.println("enter the 1st value: ");
        a = Double.parseDouble(cin.readLine());
        System.out.println("enter the 1st value: ");
        b = Double.parseDouble(cin.readLine());
        S = a + b;
        System.out.println("the sum is: "+ S);
        */
       
       System.out.println("enter the 1st value: ");
        a = Double.parseDouble(cin.readLine());
        System.out.println("enter the 1st value: ");
        b = Double.parseDouble(cin.readLine());
        average =( a + b )/ 2;
        System.out.println("the average value is: "+ average);
       
    }
    
}
 