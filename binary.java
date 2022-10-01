import java.util.*;
public class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int sp=0,ep=9,mp,c,sn;
        System.out.println("Enter 10 elements:");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searched element:");
        sn=sc.nextInt();
        while(sp<=ep)
        {
            mp=(sp+ep)/2;
            if(sn>arr[mp])
            sp=mp+1;
            else if(sn<arr[mp])
            ep=mp-1;
            else if(sn==arr[mp])
            {
            System.out.println("Searched element found :");
            break;
        }
                   }
        
    }
}