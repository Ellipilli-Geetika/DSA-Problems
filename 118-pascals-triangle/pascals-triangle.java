class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        
        for(int i = 0; i<numRows ; i++)
        {
            List<Integer> l = new ArrayList<Integer>(i);
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    l.add(j,1);
                else 
                    l.add(j,arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            }
            arr.add(i,l);
        }

        return arr;
        
    }
}