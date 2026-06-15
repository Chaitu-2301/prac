package Array.Practice;

public class HighestNo {
    public static void main(String[] args) {
        int [] num={10,20,50,40};
        int n=num.length;
        int high=num[0];
        int min=num[0];

        for(int i=1;i<n;i++)
        {
            if(high<num[i])
            {
                high=num[i];
            }
 
        }
         System.out.println("Highest Number in Arraay");
         System.out.println(high);

         for(int i=1;i<n;i++)
        {
            if(min>num[i])
            {
                min=num[i];
            }
 
        }
        System.out.println("Smallesst Number in Arraay");
         System.out.println(min);
       
    }
    
}
