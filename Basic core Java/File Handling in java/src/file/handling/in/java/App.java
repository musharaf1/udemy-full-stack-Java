
package file.handling.in.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class App {

    public static void main(String[] args){
        
        {
        File file = new File("studyeasy");
        file.mkdir();
        
        file = new File("studyeasy\\team.txt");
//            try {
//                file.createNewFile();
//                System.out.println("file created");
//            } catch (IOException ex) {
//                System.out.println("error occured while trying to create file");
//            }
            try (BufferedWriter bw = new  BufferedWriter(new FileWriter(file,true))){
                bw.write("sharaf");
                bw.newLine();
                bw.write("kezman");
                bw.newLine();
                bw.write("Agbo");
                bw.newLine();
                bw.write("lehkaz");
                bw.newLine();
                bw.write("Abs");
                bw.newLine();
                bw.write("abbey");
                bw.newLine();
                bw.write("yunus");
                System.out.println("writing onto the file successful");
                bw.close();
            } catch (IOException ex) {
                System.out.println("error occured while writing to file");
            }
        }
        
    }
     
}
