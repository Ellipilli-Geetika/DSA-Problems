class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> lmin = new Stack<>();
        Stack<Integer> rmin = new Stack<>();
        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        for(int i = 0; i < n ; i++)
        {
            while(!lmin.isEmpty() && arr[i] <= arr[lmin.peek()])
            {
                lmin.pop();
            }
            if(lmin.isEmpty())
                l[i] = -1;
            else
                l[i]= lmin.peek();
            lmin.push(i);
                
        }

        for(int i = n-1; i >=0 ; i--)
        {
            while(!rmin.isEmpty() && arr[i] < arr[rmin.peek()])
            {
                rmin.pop();
            }
            if(rmin.isEmpty())
                r[i] = n;
            else
                r[i]= rmin.peek();
            rmin.push(i);
                
        }
        long sum = 0;
        int mod = (int)1e9 + 7;
        for(int i = 0 ; i < n ; i++)
        {
            int a = i - l[i];
            int b = r[i] - i;
            long contribution = (long)a * b * arr[i];
            sum = (int)((sum + contribution) % mod);
        }
        return (int) sum;
    }
}