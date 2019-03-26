/*
    Predicates are interface that are used to perfom boolean operation
    predicates are funtional interface and can use the Lambda expression
*/
package lambda.predicate;

import java.util.function.IntPredicate;


public class App {

    
    public static void main(String[] args) {
        // predicates using the runnable interface or the ann0onymous class
        
        IntPredicate lessThan18 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                
                if(value<18){
                
                return true;
                }
                else{
                    return false; 
                
                }
                
            }
            
        };
        System.out.println(lessThan18.test(13));
        
        // Predicates using the Lambda Expression
        
        IntPredicate greaterThan12 = i->i>12;
        System.out.println(greaterThan12.test(18));
        
        // using more than one predicate declaration
         IntPredicate greaterThan15 = i->i>12;
         IntPredicate greaterThan18 = i->i>12;
         System.out.println(greaterThan15.and(greaterThan18).test(45));
        
       
    }
    
}
