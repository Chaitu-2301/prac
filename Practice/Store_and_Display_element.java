package Array.Practice;
import java.util.Scanner;

public class Store_and_Display_element {

    public static void main(String args[])
    {
        //Numbers
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter 5 Numbers");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Array Elements:");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }


        //Names

        String [] name=new String[5];

        System.out.println("Enter 5 names");
        for(int i=0;i<5;i++)
        {
            name[i]=sc.nextLine();
        }

        System.out.println("Display Names");
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }

    }
    
}
