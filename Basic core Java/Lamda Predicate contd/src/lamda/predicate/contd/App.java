
package lamda.predicate.contd;

import java.util.function.IntPredicate;


public class App {

    
    public static void main(String[] args) {
      IntPredicate greaterThan18 = i-> i>18;
      IntPredicate greaterThan25 = i-> i>25;
      
        App app = new App();
        app.demo(40, greaterThan18, greaterThan25);
    }
    public void demo(int x, IntPredicate greaterThan18,IntPredicate greaterThan25){
    
        System.out.println(greaterThan18.and(greaterThan25).test(40));
    }
    
}
