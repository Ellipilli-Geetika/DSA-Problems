class Solution {
    public String decodeString(String s) {

        String str = "";
        int i =0;
        Stack<String> st = new Stack<>();

        while(i<s.length())
        { 
            char c = s.charAt(i);
            if(st.isEmpty() && !Character.isDigit(c))
                str += Character.toString(c);
            else if (c == ']')
            {
                String temp = "";
                Stack<String> t = new Stack<>();


                while (!st.peek().equals("["))
                {
                    t.push(st.pop()); 

                }
                st.pop();
                
                String num = "";

                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    num = st.pop() + num;
                }

                int n = Integer.parseInt(num);

                while(!t.isEmpty())
                {
                    temp += t.pop();
                }
                if(st.isEmpty())
                    str += temp.repeat(n);
                else
                    st.push(temp.repeat(n));

            }
            else
                st.push(Character.toString(c));
            
            i++;

        }
        return str;
        
    }
}