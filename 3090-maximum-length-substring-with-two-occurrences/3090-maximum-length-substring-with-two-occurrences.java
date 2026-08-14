class Solution {
    public int maximumLengthSubstring(String s) {

        int n = s.length();
        int[] count = new int[26];
        int left = 0, res = 0;

        for(int i = 0; i<n; i++){

            count[s.charAt(i) - 'a']++;

            while(count[s.charAt(i) - 'a'] > 2){
                count[s.charAt(left) - 'a']--;
                left++;
            }

            res = Math.max(res,i-left+1);
        }

        return res;
        
    }
}