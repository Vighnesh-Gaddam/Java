public class array1 {
    public static void main(String args[]) 
    {
         int array[]={8,2,3,4,5,6,7};
         int a = 0;
         for(int i = 0 ; i < array.length;i++)
         {
            if (array[i] > a)
            {
                a=array[i];
            }
         }
         System.out.println("largest element of array : "+a);

         for(int i = 0 ; i < array.length;i++)
         {
            if (array[i] < a)
            {
                a=array[i];
            }
         }
         System.out.println("smallest element of array : "+a);
    }
}