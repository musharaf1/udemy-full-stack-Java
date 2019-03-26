/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author User
 */
   import java.util.Scanner;
public class Learn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  int x = 17;     
       double y = 27;
       float w = 12;
       char z = 'f';
       boolean k = true;
       String j = "hey man, what are you doing here"; 
       
       System.out.println(x+j);
        System.out.println(y);
         System.out.println(w);
          System.out.println(z);
           System.out.println(k);
            System.out.println(j);

     double fnum = 20;
     double snum = 30;
     double answer = fnum + snum;
     System.out.print(answer);
*/
     Scanner input = new Scanner(System.in);
     
     double userinput = input.nextDouble();
     double userinput2 = input.nextDouble();
     double answer = userinput + userinput2;
     System.out.print(answer);
     
     
               
       
    }
    
}
