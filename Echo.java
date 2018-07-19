import java.io.*;
import java.util.*;
class Echo
{
public static void main(String args[])
{
    int i, j, N;

    System.out.println("Enter N: ");
    Scanner s=new Scanner(System.in);
    N=s.nextInt();
    for(i=1; i<=N; i++)
    {
        for(j=1; j<i; j++)
        {
            System.out.print(" ");
        }

        System.out.print(i);
        for(j=1; j<=((N - i) * 2 - 1); j++)
        {
            System.out.print(" ");
        }

        if(i != N)
        System.out.print( i);
        System.out.println("\n");
    }

        for(i=N-1; i>=1; i--)
    {
    
        for(j=1; j<i; j++)
        {
            System.out.print(" ");
        }

       System.out.print(i);
        for(j=1; j<=((N - i ) * 2 - 1); j++)
        {
            System.out.print(" ");
        }

        System.out.print(i);
        System.out.println("\n");
    }

   
}
}
