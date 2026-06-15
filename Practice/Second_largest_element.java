package Array.Practice;

public class Second_largest_element {
    public static void main(String[] args) {
        int array[]={10,20,1,48,90};
        int n=array.length;

        int high=array[0];
        int second_largest=array[0];
        for(int i=1;i<n;i++)
        {
            if(high<array[i])
            {
                high=array[i];
            }
        }
        System.out.println("Largest Element "+high);

        for(int i=1;i<n;i++)
        {
            if(second_largest<array[i] && array[i]<high)
            {
                second_largest=array[i];
            }
        }
        System.out.println("Second largest Element "+second_largest);
    }
    
}
