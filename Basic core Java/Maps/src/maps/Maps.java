/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author musharaf
 */
      class Code implements Comparable<Code>{
      private String sectionNo;
      private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" + "sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
      
      

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public int compareTo(Code obj) {
         String code1 = sectionNo.concat(lectureNo);
         String code2 = obj.getLectureNo()+obj.getSectionNo();
         return code1.compareTo(code2);
    }
     
      
      
      }
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // There are two types of Maps: 1.Tree map 2.other
        
        // Searching through Maps: to search through the Map, we make use of the key to get d val 
        
        /* working with dotEquals and HashCode: when working with custom objeect, 
          the default dot.equals and HashCode method should be overriden
          String name1 = "Musharaf1"; 
            */
        
          /*
        Map<Integer,String> student = new HashMap<>(); //Note: HashMap doesn't follow the natural ordering of elements. 
        student.put(5, "priyanka");
        student.put(4, "maad");
        student.put(3, "tarzan");
        student.put(2, "tuhvan");
        student.put(1, "antap");
      
        for(Map.Entry<Integer,String> entry: student.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }

        for(Integer key: student.keySet()){
            System.out.println("key: "+key+" "+student.get(key));
            }
 
        Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
        while(entry.hasNext()){
            Entry<Integer, String> temp = entry.next();
            //System.out.println(entry.next());
            System.out.println("key: "+temp.getKey()+" value: "+temp .getValue());
        }
*/
          Map<Code, String> lectures = new TreeMap<>();
          lectures.put(new Code("S01","MEE101"), "Introduction to meturlogy");
          lectures.put(new Code("S02","CHE241"), "fluid mechanics");
          lectures.put(new Code("S03","ELE212"), "diode and transistor");
          lectures.put(new Code("S04","ABE404"), "engineering economics");
          lectures.put(new Code("S05","MME 501"), "intro to matetials");
          Code code = null;
          for(Map.Entry<Code, String> entry: lectures.entrySet()){
             // System.out.println("course code: "+entry.getKey()+" course content: "+entry.getValue());
             if(entry.getValue().equals("fluid mechanics")){
             
                 code = entry.getKey();
             }
          }
          System.out.println("the key for value \"fluid mechanics\" is "+code);
          
          
          
    }
    
}
