class Solution {
    public boolean isAnagram(String s, String t) {


       if(s.length() != t.length()){

        return false;
       }

       char[] chr1 = s.toCharArray();
       char[] chr2 = t.toCharArray();

       Arrays.sort(chr1);
       Arrays.sort(chr2);

       return Arrays.equals(chr1,chr2);

        
    }
}