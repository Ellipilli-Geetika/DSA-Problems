class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st1 =new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] lmin = new int[n];
        int[] rmin = new int[n];

        for(int i = 0 ; i < n ;i++)
        {
            while(!st1.isEmpty() && heights[i] <= heights[st1.peek()])
                st1.pop();
            if(st1.isEmpty())
                lmin[i] = -1;
            else
                lmin[i] = st1.peek();
            st1.push(i);
        }
        for(int i = n-1; i>=0 ;i--)
        {
            while(!st2.isEmpty() && heights[i] <= heights[st2.peek()])
                st2.pop();
            if(st2.isEmpty())
                rmin[i] = n;
            else
                rmin[i] = st2.peek();
            st2.push(i);
        }

        int max = 0;
        for(int i = 0; i < n ; i++)
        {
            int a = i - lmin[i]-1;
            int b = rmin[i] - i - 1;
            int cal = (rmin[i]-lmin[i]-1) * heights[i];

            max = Math.max(max,cal);
        }
        return max;

    }
}