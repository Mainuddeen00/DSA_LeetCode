class Solution {
    public String smallestSubsequence(String s) {

        int n = s.length();
        int last[] = new int[26];

        for(int i = 0; i<n; i++){

            char chr = s.charAt(i);
            last[chr - 'a'] = i;
        }

        Stack<Integer> st = new Stack<>();
        HashSet<Character> hset = new HashSet<>();

        for(int i = 0; i<n; i++){

            char chr = s.charAt(i);
            if(hset.contains(chr)){
                continue;
            }
            while(!st.isEmpty()){

                char prev = s.charAt(st.peek());
                if(prev > chr && last[prev - 'a'] > i){

                    st.pop();
                    hset.remove(prev);
                }else{
                    break;
                }
            }

            st.push(i);
            hset.add(chr);
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(s.charAt(st.pop()));
        }

        sb.reverse();

        return sb.toString();





        
    }
}