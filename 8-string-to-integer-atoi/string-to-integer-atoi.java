class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        boolean digitFound = false;
        boolean signFound = false;
        for(int i = 0 ; i < s.length(); i ++)
        {
            if(!digitFound && !signFound && (s.charAt(i)=='-' || s.charAt(i)=='+'))
            {
                sb.append(Character.toString(s.charAt(i)));
                signFound = true;
            }
            
            else if(!digitFound && s.charAt(i)=='0')
            {
                digitFound = true;
                continue;
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                digitFound = true;
                sb.append(Character.toString(s.charAt(i)));
            }
            else
            {
                
                break;
            }
        }
        
          if (sb.length() == 0 || sb.toString().equals("+") || sb.toString().equals("-")) {
            return 0;
        }
        
         try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        
    }
}