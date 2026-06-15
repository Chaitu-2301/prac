package Array.Practice;


public class MissingNumber {
    public static void main(String[] args) {
      int [] num={1,2,4,5,7};
      int n=num.length;
      int []arr=new int[10];
      for(int i=0;i<(num[n-1]+1);i++)
      {
        if(num[i]!=i)
        {
            arr[i]=i;
        }

      }
      
      for(int i=0;i<10;i++)
      {
        System.out.print(arr[i]+" ");
      }
     

      
      
      





        


    }  
}
