/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objecorientedprogram;

/**
 *
 * @author musharaf
 */
public class ObjecOrientedProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String y,  z = "how are you doing this morning";
       // Greetings igbo = new Greetings();
        
      y = Greetings.IGBO(" Elias");
        System.out.println(y+" "+z);
       
    }
    
}

    class Greetings
    {
        public static void noArguement(){
        
            System.out.println("hello");}
        
        public static void English( String name)
        {
            System.out.println("hello "+name);
        }
        
         public static String IGBO( String name)
        {
            return "ndewo" + name;
            
        }
          public static void Yoruba( String name)
        {
            System.out.println("nle o "+name);
        }
        
         public static void Hausa( String name)
        {
            System.out.println("nnakwan "+name);
            
        }
         
        
    }
