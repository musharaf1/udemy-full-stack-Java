
package writing.to.and.reading.from.a.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class App {

    
    public static void main(String[] args) {
        {
                    File file = new File("directory");
                    file.mkdir();

                    file = new File("directory\\crewMember.txt");
                     try {
                         file.createNewFile();
                         System.out.println("new text file created");
                     } catch (IOException ex) {
                         System.out.println("an error occured while creating a file");
                     }
                     
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
                        
                        bw.write("sharafa \"\" olalekan");
                        bw.newLine();
                        bw.write("Adelanwa \"\" adedeji");
                        bw.newLine();
                        bw.write("Mustapha \"\" oluwatobi");
                        bw.newLine();
                        bw.write("Mustapha \"\" temidayo");
                        bw.newLine();
                        bw.write("Mustapha \"\" olalekan");
                        bw.close();
                    }catch(IOException e){
                        System.out.println("error occured while writing to file");
                    
                    }
                    
                    // Reading file using buffered reader
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                        try {
                            while((line = br.readLine())!= null){
                                System.out.println(line);
                                br.close();
                            }
                        } catch (IOException ex) {
                            System.out.println("there is nothing on that line");
                        }
            } catch (FileNotFoundException ex) {
                System.out.println("file cannot be found");
            }
                    
            
            // Reading from a fle using Scanner
        
     
                    
         }
        
    }
}
