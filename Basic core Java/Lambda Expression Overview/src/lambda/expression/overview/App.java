/*
interface has only the method declartion. the definition of the method is deteremine by
the obj of the interface in the overriden method.

Lambda expresion helps us to write less code when defining the overriden interface methods

Lambda expression can be used for functional interface only. a functional interface has just only one abstract method;
 */
package lambda.expression.overview;

interface Lambda{
    public void demo();
}
public class App {

    // 1. this is one way to define the overriden interface method alothough longer
    public static void main(String[] args) {
        Lambda lambda = new Lambda() {
            @Override
            public void demo() {
                System.out.println("statement 1 with the longer method");
            }
        };
        lambda.demo();
        // 2.  defining methods using lambda expression
        Lambda lambda1 = ()->{System.out.println("statement 1 with lambda");};
        lambda1.demo();
        Lambda lambda2 = (()->System.out.println("statement 1 with lambda too"));
        lambda2.demo();
        
        //using Lambda on thredas: since Runnable interface in a functional interface we can use lambda expre.
        
        //using runnable interface
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("using runnable interface");
            }
        });
        thread1.start();
        
        // using lamda expression
        Thread thread2 = new Thread(()->{System.out.println("using Lambada expression");});
     
        thread2.start();
        
        
        
        
    }
    
}
