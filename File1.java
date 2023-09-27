
import java.io.File;
import java.io.*;
import java.util.*;
public class File1 {
     public static void create(){
        try {
            File myObj = new File("file.txt");
            myObj.createNewFile();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
     public static void write(){
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            System.out.println("Enter string:");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            myWriter.write(str);
            myWriter.close();
         
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    public static int readCount(){
        int sum =0;
        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] a = data.split(" ");
              sum+=a.length;

            }
            myReader.close();
           
         
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        
          }
         return sum;
    }
    
    public static void main(String[] args) {
    create();
    write();
 System.out.println("Number of word "+readCount());
    }
    
}
