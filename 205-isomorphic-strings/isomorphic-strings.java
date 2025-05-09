class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> map = new HashMap<Character,Character>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else if (t.indexOf(t.charAt(i))!=i)
                return false;
            else
            {
                map.put(s.charAt(i),t.charAt(i));

            }
        }
        return true;
        
    }
}