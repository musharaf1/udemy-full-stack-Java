/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

/**
 *
 * @author musharaf
 */

public class Prac {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',50.0d,100.0d);
        equations[1] = new MathEquation('a',25.0d,92.0d);
        equations[2] = new MathEquation('s',17.0d,225.0d);
        equations[3] = new MathEquation('m',11.0d,3.0d);
        
        for(MathEquation equation:equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        
        }
        
        System.out.println(" ");
        System.out.println("using overloads");
        System.out.println(" ");
        
        double leftVal = 9.0d;
        double rightVal = 4.0d;
        
        MathEquation equationOverloads = new MathEquation('d');
        
                equationOverloads.execute(leftVal, rightVal);
                System.out.print("result");
                System.out.println( equationOverloads.getResult());
        
             System.out.println(" ");
             System.out.println("using inheritance");
             System.out.println(" ");
             
            CalculateBase[] calculates = {
                new Adder(92.0, 25.0),
                new Subtracter(225.0, 17.0),
                new Multiplier(11.0, 3.0),
                new Divider(100.0, 50.0)
            };

       for(CalculateBase calculator:calculates){
           calculator.calculate();
           System.out.print("result = ");
           System.out.println(calculator.getResult());
       
       }
    }
//     public static MathEquation create(double leftVal, double rightVal, char opCode){
//         MathEquation equation = new MathEquation();
//         equation.setLeftVal(leftVal);
//         equation.setRightVal(rightVal);
//         equation.setOpCode(opCode); 
//         return equation;
//        } 
       
}
  
        
    
    

