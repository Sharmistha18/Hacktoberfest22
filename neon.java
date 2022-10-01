import java.util.*;

public class neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        int r,s=0,i;
        System.out.println("Enter 10 numbers:");
        for(i=0;i<20;i=i+2)
        {
            ar[i]=sc.nextInt();
            ar[i+1]=ar[i]*ar[i];
        }
        
        for(i=0;i<20;i=i+2)
        {
            while(ar[i+1]!=0)
            {
               r=ar[i+1]%10;
               s=s+r;
               ar[i+1]=ar[i+1]/10;
            }
            if(ar[i]==s)
            {
                System.out.println("The number"+ar[i]+"is neon");
            }
            else
            {
                System.out.println("The number"+ar[i]+"is not neon");
            }
            s=0;
        }
    }
}