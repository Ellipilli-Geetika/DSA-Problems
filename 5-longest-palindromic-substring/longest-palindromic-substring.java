class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 1;

        String maxPal = s.substring(0,1);
        for(int i = 0; i < s.length() ; i++)
        {
            for(int j = i ; j < s.length() ; j++)
            {
                if(maxLen < j-i+1 && isPalindrome(s.substring(i,j+1)))
                {
                    if(maxLen < (j-i+1))
                    {
                        maxLen = j-i+1;
                        maxPal = s.substring(i,j+1);
                    }
                }
            }
        }
        return maxPal;
      

    }

    public boolean isPalindrome(String str)
    {
        int left = 0, right = str.length()-1;

        while(left<=right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}