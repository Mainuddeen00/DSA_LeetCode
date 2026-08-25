class Solution {
    public int firstUniqChar(String s) {

        int n = s.length();
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){

            char chr = s.charAt(i);

            map.put(chr,map.getOrDefault(chr,0)+1);
        }
       

        
        for(int i = 0; i<n; i++){

            char chr = s.charAt(i);

            if(map.get(chr) == 1){

                return i;
            }
        }

        return -1;

       

        
    }
}