class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    public void quickSort(int[] nums, int low, int high)
    {
        if(low < high)
        {
            int pIndex = index(nums,low,high);
            quickSort(nums,low,pIndex-1);
            quickSort(nums,pIndex+1,high);
        }
    }

    public int index(int[] nums, int low,int high)
    {
        int pivot = nums[low];
        int i=low, j = high;
        while(i<j){
            while(nums[i]<=pivot && i<high)
            {
                i++;
            }
            while(nums[j]>pivot && j>low)
            {
                j--;

            }
            if(i<j)
            {
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i] = temp;
            }
        }
        nums[low]= nums[j];
        nums[j] = pivot;

        return j;
    }
}