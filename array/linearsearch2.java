public class linearsearch2 {
    //👇👇 code of linear search
    int search(int nums[],int target)
    {
        for (int i=0;i<nums.length;i++) {
            if(nums[i]==target)
            {
                
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[])
    {
        //creating a object of my class 
        linearsearch2 yo = new linearsearch2();
        int arr[]={2,5,17,3,6,2};
        int key = 3;
        //to print ans in a systematic way
        if(yo.search(arr, key)>0)
        {
            System.out.println("Target ("+key+") found at index "+yo.search(arr, key));
        }
        else{
            System.out.println("key not available in the array");
    }
        
    }
}
