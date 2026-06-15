package Array.Practice;

public class SumofArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
    int sum=0;

    for(int i=0;i<5;i++)
    {
        sum=sum+arr[i];

    }
    System.out.println(sum);
    double avg=(double)sum/5;   //type conversion to double 
    System.out.println("Average of ARraay is"+avg);
    }

    
    
}
