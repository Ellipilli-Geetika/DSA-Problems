class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st = new Stack<>();
        for( int  i = 0; i < num.length() ; i++)
        {
            char c = num.charAt(i);
            while(!st.isEmpty() && k>0 && c < st.peek())
            {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(k > 0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        String s = "";

        while(!st.isEmpty())
        {
            s += Character.toString(st.peek());
            st.pop();
        }
        String str = "";
        for(int i = s.length()-1; i >=0 ; i--)
        {
            if(str.isEmpty() && s.charAt(i)=='0')
                continue;
            str += Character.toString(s.charAt(i));
        }
        return str.isEmpty()?"0":str;
    }
}