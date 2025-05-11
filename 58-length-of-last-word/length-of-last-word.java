class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0)
            return 0;
        s.trim();
        String[] str = s.split(" ");
        return str[str.length-1].length();
        
    }
}