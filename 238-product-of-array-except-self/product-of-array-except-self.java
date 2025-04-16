class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int product = 1;
        prefix[0]=1;
        for(int i= 0;i <nums.length-1 ; i++)
        {
            prefix[i+1] = prefix[i] * nums[i];
        }
        
        for(int  i = nums.length -2; i>= 0; i--)
        {
            product*=nums[i+1];
            prefix[i] = product * prefix[i];
        }
        return prefix;

    }
}