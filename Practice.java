import java.io.BufferedReader;  
import java.io.FileReader;
import java.util.Scanner;  
   
class Practice
{  
    public static void main(String args[]) throws Exception{
        String line;
        int count=0;
        String match;
        Scanner sc=new Scanner(System.in);
        match=sc.next();

        FileReader file =new FileReader("data.txt");
        BufferedReader br=new BufferedReader(file);
        while((line=br.readLine())!=null){
            String words[]=line.split(" ");
            for(String word : words)
            {
                if(word.equals(match))
                    count++;
            }
        }
        System.out.println(count);
    }
}

