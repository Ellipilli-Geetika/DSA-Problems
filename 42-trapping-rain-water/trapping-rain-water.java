class Solution {
    public int trap(int[] height) {
        int sum = 0, maxLeft = 0, maxRight = 0;
        int l =0, r = height.length -1;
        
        while ( l <= r)   // we need to update maxLeft, maxRight and update sum when something less among maxLeft and maxRight is encountered.
        {
            if(maxLeft <= maxRight)
            {
                if(maxLeft < height[l])
                {
                    maxLeft = height[l];
                }
                else
                {
                    sum += maxLeft - height[l];
                    
                }
                l++;
            }
            else
            {
                if(maxRight < height[r])
                {
                    maxRight = height[r];
                }
                else
                {
                    sum += maxRight - height[r];
                }
                r--;
            }

        }
        return sum;
           
    }
}