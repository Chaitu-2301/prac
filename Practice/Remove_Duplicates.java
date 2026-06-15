package Array.Practice;

class Remove_Duplicates{
    public static void main(String[] args) {
        int arr[]={1,1,2,4,6,5,6,8,2};
        int n=arr.length;

         System.out.println("Before Remove Duplicates");
//step 1
        for(int i=0;i<n;i++)
        {
             System.out.print(arr[i]+" ");
        }
         System.out.println();
       
//step 2 replace by zero
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }

            }
        }

         System.out.println();
        for(int i=0;i<n;i++)
        {
             System.out.print(arr[i]+" ");
        }

//step 3 : if zero ignore        
         System.out.println();
       
         System.out.println("After Removing Duplicates");

        for(int i=0;i<n;i++)
        {
           if(arr[i]==0)
           {
              continue;
           }
           else{
             System.out.print(arr[i]+" ");
           }
        }
       


    }
}