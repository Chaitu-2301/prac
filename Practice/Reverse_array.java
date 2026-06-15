package Array.Practice;

public class Reverse_array {

    public static void main(String args[])
    {
       int [] num={10,20,30,40,50,60};
         int n=num.length;
         for(int o=0;o<n;o++){
            System.out.print(num[o]+" ");
        }

         System.out.println();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
            i++;
            j--;
        }
        for(int m=0;m<n;m++){
            System.out.print(num[m]+" ");
        }

    }

}