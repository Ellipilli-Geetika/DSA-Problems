class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<int[]> lmin = new Stack<>();
        Stack<int[]> rmin = new Stack<>();
        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        for(int i = 0; i < n ; i++)
        {
            while(!lmin.isEmpty() && arr[i] <= lmin.peek()[0])
            {
                lmin.pop();
            }
            if(lmin.isEmpty())
                l[i] = -1;
            else
                l[i]= lmin.peek()[1];
            lmin.push(new int[]{arr[i],i});
                
        }
        System.out.println("l"+Arrays.toString(l));

        for(int i = n-1; i >=0 ; i--)
        {
            while(!rmin.isEmpty() && arr[i] < rmin.peek()[0])
            {
                rmin.pop();
            }
            if(rmin.isEmpty())
                r[i] = n;
            else
                r[i]= rmin.peek()[1];
            rmin.push(new int[]{arr[i],i});
                
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