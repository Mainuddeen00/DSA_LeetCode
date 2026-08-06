class Solution {

  public int smallestNumber(int n, int t){

    int curr = n;

    while(true){

     if(getDigitProduct(curr)%t==0){

        return curr;
        }

         curr++;
      }

}

    public int getDigitProduct(int num) {

        int pro = 1;

        if(num == 0){

            return 0;
        }

        while(num > 0){

            pro *= (num%10);
            num /= 10;
        }

        return pro;
        
    }


}