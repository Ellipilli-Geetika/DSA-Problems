class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        long result = 0 ;
        int sign = 1, i=0;
        if(s.length()==0)
            return 0;

        if(s.charAt(0)=='-')
        {   sign = -1;
            i++;
        }else if(s.charAt(0)=='+')
        {
            sign = 1;
            i++;
        }
       
        while(i<s.length())
        {
            
           if(!Character.isDigit(s.charAt(i)))
            {
                break;
            }
            result = result*10 + (s.charAt(i)-'0');
            if(sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
              
        }
        
        return (int) (sign*result);
        
    }
}