class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int[] arr = new int[nums.length];

        for(int  j = 0; j < nums.length ; j++)
        {
            boolean add = false;
            for(int i = 1; i < nums.length; i++)
            {
                int n = (j+i) % nums.length;
                if (nums[n]>nums[j])
                {
                    arr[j]=nums[n];
                    add = true;
                    break;
                }

            }
            if(!add)
            {
                arr[j] = -1;
            }
        }
        return arr;
    }
}