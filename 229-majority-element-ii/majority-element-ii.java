class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int count1  = 0 , elem1 = Integer.MIN_VALUE, count2 = 0 , elem2 = Integer.MIN_VALUE;
        List<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < nums.length ; i++)
        {
            if(count1==0 && elem2!=nums[i])
            {
                count1  = 1;
                elem1 = nums[i];
            }
            else if(count2==0 && elem1!=nums[i])
            {
                count2  = 1;
                elem2 = nums[i];
            }
            else if(nums[i]==elem1)
            {
                count1++;
            }
            else if(nums[i]==elem2)
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i = 0 ; i< nums.length ; i++)
            {
                if(nums[i]==elem1)
                    count1++;
                if(nums[i]==elem2)
                    count2++;

            }
        System.out.println("elem1 elem2"+elem1+elem2);
        
        if(count1>Math.floor(nums.length/3))
            l.add(elem1);
        if(count2 > Math.floor(nums.length/3))
            l.add(elem2);
    

        return l;
        


    }
}