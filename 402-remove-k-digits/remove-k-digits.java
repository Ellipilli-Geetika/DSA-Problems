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
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty())
        {
            s.append(st.pop());
        }

        s.reverse();

        int  i = 0;
        while(i < s.length() && s.charAt(i) == '0')
            i++;
        String str = s.substring(i);

        return str.isEmpty()?"0":str;
    }
}