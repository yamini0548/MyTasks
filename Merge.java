
import java.io.*;
 
public class Merge
{
    public static void main(String[] args) throws IOException
    {
         PrintWriter pw = new PrintWriter("merge.txt");
         
        
        BufferedReader br = new BufferedReader(new FileReader("task.txt"));
         
        String line = br.readLine();
         
          while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
         
        br = new BufferedReader(new FileReader("task1.txt"));
         
        line = br.readLine();
         
         while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
         
        pw.flush();
        br.close();
        pw.close();
         
        System.out.println("success");
}
}
