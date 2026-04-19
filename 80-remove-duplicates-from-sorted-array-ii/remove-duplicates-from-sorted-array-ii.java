class Solution {
    public int removeDuplicates(int[] nums) {

        int  i =1,j = nums.length, count = 1;


        while(i < j)
        {
            if ( nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            
            if (count > 2)
            {
                int  num = nums[i];
                for( int k = i+1; k < nums.length ; k++)
                {
                    nums[k-1] = nums[k];
                }
                nums[nums.length-1] = num;
                j--;

            }
            else
                i++;
            


        }
        return j;
    }
}