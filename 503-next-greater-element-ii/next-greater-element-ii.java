class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums.length];

        for(int  i = 2 * nums.length - 1; i >=0; i--)
        {
               int  n = i % nums.length;

                while(!st.isEmpty() && nums[n] >= st.peek())
                    st.pop();
                if(st.isEmpty() &&  i < nums.length)
                    arr[i] = -1;
                else if(i < nums.length)
                    arr[i] = st.peek();
                st.push(nums[n]);
        }


        return arr;
    }
}