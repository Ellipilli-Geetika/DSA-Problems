class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        char[] c = s.toCharArray();
        for(char ch :c)
        {
            if(ch=='('|| ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                if (st.isEmpty() || st.peek()!='(')
                    return false;
                else
                    st.pop();
            }
            else if(ch==']')
            {
                if (st.isEmpty() || st.peek()!='[')
                    return false;
                else
                    st.pop();
            }
            else if(ch=='}')
            {
                if (st.isEmpty() || st.peek()!='{')
                    return false;
                else
                    st.pop();
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;

    }
}