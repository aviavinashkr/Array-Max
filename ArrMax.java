import java.util.*;
class ArrMax
{
    public static void main(String args[])
    {
        int arr[]=new int[6];
        int i,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the six elements");
        for(i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(i=1;i<6;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest="+max);
    }
}
