class Solution {
    public long subArrayRanges(int[] nums) {

        long sum = 0;
        int n = nums.length ;

        int[] lmin = new int[n];
        int[] lmax = new int[n];
        int[] rmin = new int[n];
        int[] rmax = new int[n];

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        Stack<Integer> st4 = new Stack<>();

        for( int  i = 0 ; i < nums.length ; i++)
        {
            while (!st1.isEmpty() && nums[i] <= nums[st1.peek()])
                st1.pop();

            if(st1.isEmpty())
                lmin[i] = -1;
            else
                lmin[i] = st1.peek();
            st1.push(i);

            while(!st2.isEmpty() && nums[i] >= nums[st2.peek()])
                st2.pop();
            if(st2.isEmpty())
                lmax[i] = -1;
            else
                lmax[i] = st2.peek();
            st2.push(i);
        }
        for(int  i = n-1 ; i >= 0 ; i--)
        {
            while (!st3.isEmpty() && nums[i] < nums[st3.peek()])
                st3.pop();
            if(st3.isEmpty())
                rmin[i] = n;
            else
                rmin[i] = st3.peek();
            st3.push(i);

            while(!st4.isEmpty() && nums[i] > nums[st4.peek()])
                st4.pop();
            if(st4.isEmpty())
                rmax[i] = n;
            else
                rmax[i] = st4.peek();
            st4.push(i);
        }

        for( int i = 0; i < n ; i++)
        {
            int a = i - lmin[i];
            int b = rmin[i] - i;
            int c = i -lmax[i];
            int d = rmax[i] - i;

            long cal = ((long) (c*d) - (long)(a*b) )* nums[i];
            sum += cal;
        }
        return sum;
    }
}