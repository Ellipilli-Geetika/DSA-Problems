class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
           return new int[]{-1, -1};

        return BinarySearch(nums,0,nums.length-1,target);
        
    }
    public int[] BinarySearch(int[] nums,int left , int right , int target)
    {
        if(left > right)
           return new int[]{-1, -1};

        int mid = (left + right)/2;
        if(nums[mid] == target)
        {
            int l = mid -1, r = mid+1;
            while(l >= 0 && nums[l]==target)
                l--;
            while(r < nums.length && nums[r]==target)
                r++;
            return new int[]{l+1,r-1};
        }
        else if(nums[mid] > target)
            return BinarySearch(nums,left,mid-1,target);
        return BinarySearch(nums,mid+1,right,target);
    }
}