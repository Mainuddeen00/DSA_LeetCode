class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){

            String word = strs[i];

            char[] chr = word.toCharArray();
            Arrays.sort(chr);

            String sorted = new String(chr);

            if(!map.containsKey(sorted)){

                map.put(sorted,new ArrayList<>());

            }
            map.get(sorted).add(word);


        }

        return new ArrayList<>(map.values());



        
    }
}