import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class P
{
   public static void main(String[] args) throws Exception 
   { Scanner sc = new Scanner(System.in);
      int cnt=0;
      String s;
      String[] buffer; 
      System.out.println("Enter the content: ");
      String str = sc.nextLine();
      File f1=new File("file1.txt"); 
    BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"));
    writer.write(str);
       
      
      FileReader fr = new FileReader(f1);
      BufferedReader bfr = new BufferedReader(fr);
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the word to be Searched");
      String wrd=sc.nextLine();
       
           
      while((s=bfr.readLine())!=null)   
      {
         buffer=s.split(" ");  
          for (String chr : buffer) 
          {
                 if (chr.equals(wrd))   
                 {
                   cnt++;    
                 }
          }
      }
      if(cnt==0)  
      {
         System.out.println("Word not found!");
      }
      else
      {
         System.out.println("Word : "+wrd+"found! Count : "+cnt);
      }
      
         fr.close();
   }
}