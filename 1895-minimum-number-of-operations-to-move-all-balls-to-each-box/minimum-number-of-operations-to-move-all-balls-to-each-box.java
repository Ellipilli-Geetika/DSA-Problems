class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int count = 0;
        int sum = 0;
        ans[0] = 0;
        for(int i = 1; i < boxes.length() ; i++)
        {
            if(boxes.charAt(i-1)=='1')
            {
                count = count+1;
                
            }
            sum = sum + count;

            ans[i]=sum;
        }
        count = 0;
        sum = 0;

        for(int i=boxes.length()-2 ; i >=0;i--)
        {
            if(boxes.charAt(i+1)=='1')
            {
                count = count+1;
                
            }
            sum = sum +count;
            ans[i] = ans[i] + sum;
        }
        return ans;
    }
}