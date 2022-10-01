package Digital;
import java.util.*;
public class Prog1 
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.print("Enter element ");
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Enter k ");
        k=sc.nextInt();
        
        
        if(k>n)
        {
            k=k%n;
        }
        
        int c[]=new int[n];
        
        for(int i=0;i<k;i++)
        {
            c[i]=arr[n-k+i];
        }
        
        int p=0;
        
        for(int i=k;i<n;i++)
        {
            c[i]=arr[p];
            p++;
        }
        System.out.print("Output: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(c[i]+",");
        }
    }
    
}
