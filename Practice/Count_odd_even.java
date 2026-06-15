package Array.Practice;

public class Count_odd_even {
    public static void main(String[] args) {
        int [] arr={10,20,30,11,22,33,44,55,7,21,13};
        int n=arr.length;
        int evencount=0;
        int oddcount=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                {
                evencount++;

            }

            else{
                oddcount++;
            }
        }
        System.out.println("Even Number Count is: "+evencount);
            System.out.println("Odd Number Count is: "+oddcount);
    
}
}
