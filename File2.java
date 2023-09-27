package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File2
{
   public static void main(String[] args) throws IOException 
   {
      create();
      write();
      String[] words=null;  //Intialize the word Array
      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String s;     
      String input="Java";   // Input word to be searched
      int count=0;   //Intialize the word to zero
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(" ");  //Split the word using space
          for (String word : words) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                   count++;    //If Present increase the count by one
                 }
          }
      }
      if(count!=0)  //Check for count not equal to zero
      {
         System.out.println("The given word is present for "+count+ " Times in the file");
      }
      else
      {
         System.out.println("The given word is not present in the file");
      }
      
         fr.close();
   }


}
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