import java.io.*;
import java.util.*;
import java.lang.*;
class Demo
{
  public static void main(String args[])
  {  
    int n, i, j;
    System.out.println("Enter N: ");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
      for(i=n; i>=1; i--)
     {
        for(j=n; j>i; j--)
        {
            System.out.print( j);
        }
     
        for(j=1; j<=(i*2-1); j++)
        {
            System.out.print(i);
        }
        for(j=i+1; j<=n; j++)
        {
            System.out.print(j);
        }

       System.out.println(" ");
    }
    for(i=1; i<n; i++)
    {
        
        for(j=n; j>i; j--)
        {
            System.out.print(j);
        }

       
        for(j=1; j<=(i*2-1); j++)
        {
            System.out.print(i+1);
        }

        
        for(j=i+1; j<=n; j++)
        {
            System.out.print(j);
        }

       System.out.println(" ");
    }

   }
} 
