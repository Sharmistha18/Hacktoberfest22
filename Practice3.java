import java.util.*;
public class Practice3
{
    public static void main (String args[])
    {
        int sum=0; double avg;
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[5];
        System.out.println("Enter The Numbers: ");
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<arr.length; j++)
        {
            sum = sum + arr[j];
        }
        avg = sum/(arr.length);
        System.out.println("The Sum Of The Elements Is: " +sum);
        System.out.println("The Average Of The Elements Is: " +avg);
    }
}
