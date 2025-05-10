class Solution {
    public String reverseVowels(String s) {
        
        char[] ch = s.toCharArray();
        int  i = 0, j = ch.length-1;
        String v = "aeiouAEIOU";
        while(i<j)
        {
            while(i<j && !v.contains(Character.toString(ch[i])))
                i++;
            while(i <j && !v.contains(Character.toString(ch[j])))
                j--;
            if(i<j)
            {
                char temp = ch[j];
                ch[j] = ch[i];
                ch[i] = temp;
            }
            i++;
            j--;
        }
        String result = new String(ch);

        return result;
    }
}