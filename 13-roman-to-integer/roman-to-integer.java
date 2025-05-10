class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
}};
        char[] ch = s.toCharArray();
        if(ch.length==1)
            return map.get(ch[0]);
        int result = 0 ;
        for(int i = 0; i < ch.length ; i++)
        {
            if(i+1 < ch.length && map.get(ch[i])< map.get(ch[i+1]))
            {
                result += map.get(ch[i+1]) - map.get(ch[i]);
                i = i+1; // did i = i +2 
            }
            else
            {
                result += map.get(ch[i]);
            }
        }
        return result;
    }
}