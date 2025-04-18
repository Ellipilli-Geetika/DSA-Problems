class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        
        for(int i = 0; i<numRows ; i++)
        {
            List<Integer> l = new ArrayList<Integer>(i);
            int sum =1;
            l.add(sum);
            for(int j=1;j<=i;j++)
            {
                sum = sum * (i+1-j);
                sum = sum/j;
                l.add(sum);
            }
            arr.add(i,l);
        }

        return arr;
        
    }
}