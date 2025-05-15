class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 )
            return 0;
        return BinarySearch(nums,0,nums.length-1,target);
        
    }

    public int BinarySearch(int[] nums, int left, int right, int target)
    {
        if(left > right)
        {
            if(right < 0)
                return 0;
            
            else if (nums[right]<target)
                return left;
            else
                return right;
        }
        int mid = (left+right)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid] > target)
            return BinarySearch(nums,left,mid-1,target);
        return BinarySearch(nums,mid+1,right,target);
    }
}