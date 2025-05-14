class Solution {
    public int search(int[] nums, int target) {
       return  BinarySearch(nums,0,nums.length-1,target);


        
    }
    public int BinarySearch(int[] nums, int l, int r, int key)
    {
        if(l<=r)
        {
            int m = l + (r - l) / 2; 
            if(nums[m] > key)
            {
                return BinarySearch(nums,l,m-1,key);
            }
            else if( nums[m] < key)
            {
                return BinarySearch(nums,m+1,r,key);
            }
            else
            {
                return m;
            }
        }
        return -1;
    }
}