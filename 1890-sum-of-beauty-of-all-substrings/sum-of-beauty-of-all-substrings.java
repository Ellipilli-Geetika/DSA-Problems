class Solution {
    public int beautySum(String s) {

        if(s==null || s.length()==0)
            return 0;
        
        
        int count =0;
        for(int i = 0; i < s.length() ; i++)
        {
            for(int j = i+1; j <= s.length() ; j++)
            {
               count += beauty(s.substring(i,j));
            }
        }
        return count;
        
    }

    public int beauty(String str)
    {
        if (str.length() <= 1)
            return 0;

        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxf = 0;
        int minf = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f > 0) {
                maxf = Math.max(maxf, f);
                minf = Math.min(minf, f);
            }
        }

        return maxf - minf;

    }
}