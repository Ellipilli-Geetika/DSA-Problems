class Solution {
    public String longestPalindrome(String s) {
    
        if(s.length()==0)
            return "";
        
        int start =0, end = 0;
        

        for(int i = 0 ; i < s.length() ; i++)
        {
            int odd = middleMax(s,i,i);
            int even = middleMax(s,i,i+1);
            int maxLen = Math.max(odd,even);

            if(maxLen > end-start)
            {
                start = i - (maxLen-1)/2;
                end  = i +(maxLen)/2;
            }
        }

        return s.substring(start,end+1);
    }

    private int middleMax(String str, int left , int right)
    {
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right))
        {
            left--;
            right++;
        }
        return right - left -1;
    }
}