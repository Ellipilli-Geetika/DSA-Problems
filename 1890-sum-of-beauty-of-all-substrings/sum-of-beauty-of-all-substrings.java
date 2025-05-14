class Solution {
    public int beautySum(String s) {
        int[][] freq = new int[s.length()+1][26];

        int totalBeauty = 0;
        for(int i = 0; i < s.length() ; i++)
        {
            int[] fr = new int[26];
            
            for(int j = i ; j < s.length() ; j++)
            {

                fr[s.charAt(j)-'a']++;   
                int maxf = Integer.MIN_VALUE;
                int minf = Integer.MAX_VALUE;  

                for(int k = 0 ; k < 26 ; k++)
                {
                    if (fr[k] > 0) {
                        maxf = Math.max(maxf, fr[k]);
                        minf = Math.min(minf, fr[k]);
                    }
                }
                totalBeauty += (maxf - minf);
            }
        }
        return totalBeauty;
    }
}