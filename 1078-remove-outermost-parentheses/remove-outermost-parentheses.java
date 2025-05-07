class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        char[] ch = s.toCharArray();

        int c = 0 ; 
        for(int i = 1; i < s.length(); i ++)
        {
            if ( ch[i]=='(')
            {
                c++;
                str = str+ch[i];
            }
            else
            {
                if ( c==0)
                {
                    i++;
                }
                else
                {
                    str = str+ch[i];
                    c--;
                }
            }

        }
        
        return str;
        
    }
}