/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangenumber;

/**
 *
 * @author User
 */
import java.util.*;
public class RangeNumber {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter word here\t");
        String z = sc.nextLine();
        
        int x = 0;
        int y = z.length()-1;
        boolean w = true;
        while(x<y)
        {
            char start = z.charAt(x);
            char end  = z.charAt(y);
            if(start != end)
            {
                w =  false;
                break;
            }
           
            x++;
            y--;
        }
        if(w==true)
        {
            System.out.println(" letter "+ z +" is a palimdrome");
        }
        else
        {
            System.out.println(" letter "+ z +" is not a palimdrome");
        }
        
        
        
    }
}
