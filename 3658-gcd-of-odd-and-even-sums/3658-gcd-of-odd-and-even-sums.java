class Solution {
  
    int gcd(int sumOdd,int sumEven){

        if(sumEven == 0){
            return sumOdd;
        }

        return gcd(sumEven,sumOdd%sumEven);
    }

    public int gcdOfOddEvenSums(int n) {


        int sumOdd = n*n;
        int sumEven = n * (n+1);




     return gcd(sumOdd,sumEven);
       
        
    }
}