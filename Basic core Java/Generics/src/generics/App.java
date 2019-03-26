/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author musharaf
 */
class Data{
 private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Data{" + "obj=" + obj + '}';
    }
    
 
}

class GenericClass<T>{

    public T genericType() {
        return genericType;
    }

    @Override
    public String toString() {
        return "Generic{" + "genericType=" + genericType + '}';
    }
    private T genericType;

    public GenericClass(T genericType) {
        this.genericType = genericType;
    }

}
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Data data = new Data("some strings");
        String stringValue = (String) data.getObj();
        System.out.println(stringValue);*/
        
        GenericClass<String> gdata = new GenericClass("");
        String stringText = gdata.genericType();
        System.out.println(stringText);
        App hello = new App();
        hello.isPalindrom("hello");
        
    }
       void isPalindrom(String text){
           String s1="",s2="";
           
       for(int i = 0; i<text.length(); i++){
       s1 += text.charAt(i);
       }
       for(int j = 5; j>0; --j){
           s2 += text.charAt(j);
       }
       if(s1.equals(s2)){
           System.out.println("is palindrom");
       }else {System.out.println("not a palindrom"); }
       
       }
}
