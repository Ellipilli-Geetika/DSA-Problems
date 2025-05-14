class Solution {
    public int beautySum(String s) {
        int[][] freq = new int[s.length()+1][26];

        for(int i = 0; i < s.length() ; i++)
        {
            for(int j = 0; j < 26 ; j++)
            {
                freq[i+1][j] = freq[i][j];

            }
            freq[i+1][s.charAt(i) - 'a']++;
        }
        int totalBeauty = 0;
        for(int i = 0; i < s.length() ; i++)
        {
            
            for(int j = i ; j < s.length() ; j++)
            {
                int[] fr = new int[26];            

                for(int k = 0 ; k < 26 ; k++)
                {
                    fr[k] = freq[j+1][k]-freq[i][k];
                }

                int maxf = 0;
                int minf = Integer.MAX_VALUE;
                for (int f : fr) {
                    if (f > 0) {
                        maxf = Math.max(maxf, f);
                        minf = Math.min(minf, f);
                    }
                }
                totalBeauty += (maxf - minf);
            }
        }
        return totalBeauty;
    }
}