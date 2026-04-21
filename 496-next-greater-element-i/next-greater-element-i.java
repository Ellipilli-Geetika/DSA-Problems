class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        int  i =0;
        for(int n :nums2)
        {
            map.put(n,i++);
        }
        i = 0;
        for(int n:nums1)
        {
            int j = map.get(n);
            arr[i++] = nextGreater(nums2,j,n);
            
        }
        return arr;

        
    }
    public int nextGreater(int[] arr, int i,int x)
    {
        int n = arr.length;
        if (i>= n)
            return -1;
        for(int  j=i ; j <n ; j++)
        {
            if (arr[j]>x)
            return arr[j];
        }

        return -1;
        

    }
}