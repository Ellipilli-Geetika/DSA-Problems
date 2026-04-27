class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st1 =new Stack<>();
        int max = 0;
        for(int i = 0 ; i < n ;i++)
        {
            while(!st1.isEmpty() && heights[i] <= heights[st1.peek()])
            {
                int elem = heights[st1.pop()];
                int nextMin = i;
                int prevMin = st1.isEmpty() ? -1 : st1.peek();

                max = Math.max(max,(nextMin-prevMin-1)*elem);
            }
            st1.push(i);
        }
        while(!st1.isEmpty())
        {
                int elem = heights[st1.pop()];
                int nextMin = n;
                int prevMin = st1.isEmpty() ? -1 : st1.peek();

                max = Math.max(max,(nextMin-prevMin-1)*elem);
        }
        return max;

    }
}