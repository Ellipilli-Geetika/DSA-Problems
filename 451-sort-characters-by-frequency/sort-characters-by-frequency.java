class Solution {
    public String frequencySort(String s) {

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;

        for(int i = 1; i < ch.length ; i++)
        {
            if(ch[i]!=ch[i-1])
            {
                map.put(ch[i-1],count);
                count = 1;
            }
            else
            {
                count++;
            }
        }
        map.put(ch[ch.length-1],count);


        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char key = pq.poll();
            sb.append(String.valueOf(key).repeat(map.get(key)));
        }

        return sb.toString();
        
    }
}