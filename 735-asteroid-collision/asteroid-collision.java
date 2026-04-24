class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < asteroids.length ; i++)
        {
            if(asteroids[i]<0)
            {
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(asteroids[i]) > st.peek())
                    st.pop();
                if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i]))
                {
                    st.pop();
                    continue;
                }
            }
            if(asteroids[i] < 0)
            {
                if(st.isEmpty() || st.peek() < 0)
                    st.push(asteroids[i]);
            }
                
            else if(asteroids[i] > 0)
                st.push(asteroids[i]);
        }

        int size  = st.size();
        int[] arr = new int[size];
        for(int i = size-1; i >=0; i--)
        {
            arr[i] = st.pop();
        }
        

        return arr;
        
    }
}