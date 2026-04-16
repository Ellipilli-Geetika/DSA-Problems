class Solution {
    public String getHint(String secret, String guess) {
        
        int x = 0,y=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        for(int i = 0; i< secret.length(); i++)
        {
            int key = secret.charAt(i);
            map.put(key,map.getOrDefault(key, 0) + 1);
            int g = guess.charAt(i);
            if (key==g)
                x++;
        }

        for(int i = 0;i < guess.length() ; i++)
        {
            int s = guess.charAt(i);
            if (map.containsKey(s))
            {
                map.put(s,Math.max(map.get(s) - 1,0));
            }
        }
        
        for (int value : map.values()) {
                y += value;
            }
            y = secret.length()- y - x;

            return x+"A"+ y + "B";


    }
}