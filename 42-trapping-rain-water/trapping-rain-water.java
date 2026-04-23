class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefixmax = new int[n];
        int[] suffixmax = new int[n];
        prefixmax[0] = 0;
        suffixmax[n-1] = 0;
        for(int i = 1; i < n ; i++)
        {
            prefixmax[i] = Math.max(prefixmax[i-1],height[i-1]);
        }
        for(int i = n-2; i >= 0 ; i--)
        {
            suffixmax[i] = Math.max(suffixmax[i+1],height[i+1]);
        }
        int sum = 0;
        
        for(int i = 0; i < n ; i++)
        {
            int m = Math.min(prefixmax[i],suffixmax[i]);
            
            if(m > height[i]) {
                sum += m - height[i];
            }

        }
        return sum;
           
    }
}