class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = str.length -1 ; i >=0 ; i --)
        {
            if(!str[i].isEmpty())
            {
                result.append(str[i].trim());
                if(i!=0)
                {
                    result.append(" ");
                }
            }
        }
        return result.toString();
        
    }
}