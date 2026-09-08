class Solution {
    public int countCommas(int n) {

        if(n < 999){

            return 0;
        }
        int count = 0;



        for(int i = 0; i<n-999; i++){
                count++;
        }

        return count;
        
    }
}