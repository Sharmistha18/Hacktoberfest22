import java.util.*;
public class bubble_sort
{
    public static void main(String args[])
    {
        int ar[]=new int[10];
        int c=1,i,t;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(i=0;i<10;i++)
        {
            ar[i]=sc.nextInt();
        }
        while(c>0)
        {
            c=0;
            for(i=0;i<9;i++)
            {
                if(ar[i]>ar[i+1])
                {
                    t=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=t;
                    c=1;
                }
            }
        }
        System.out.println("The sorted array :");
        for(i=0;i<10;i++)
        {
            System.out.println(ar[i]);
        }
    }
}