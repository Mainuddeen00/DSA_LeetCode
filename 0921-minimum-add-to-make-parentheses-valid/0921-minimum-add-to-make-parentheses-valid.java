class Solution {
    public int minAddToMakeValid(String s) {


        int openBrackets = 0;
        int closeBracketsNeeded = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openBrackets++;
            } else {
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    
                    closeBracketsNeeded++;
                }
            }
        }
        
        return openBrackets + closeBracketsNeeded;
    }


    

        
    
}