public class binarysearch_3 {
     void bsearch(int nums[],int target)
    {
        //👇👇 code of linear search
        int start = 0,end=nums.length-1,mid=-1;
        for (int i = 0; i < nums.length; i++) {
            mid = start + (end - start)/2;
            if(mid<target)
            {
                start = mid;
            }
            else if(mid>target)
            {
                end = mid;
            }
            else
            {
                mid = mid;
            }
        }
        if(mid<0){
        System.out.println("Element found at index "+mid);
        }
        else {
            System.out.println("key not available in the array");
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,5,17,3,6,2};
        int key = 1;
        binarysearch_3 yo = new binarysearch_3();
        yo.bsearch(arr, key);
    }
}
