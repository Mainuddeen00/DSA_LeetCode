class Solution {

   private int gcd(int max,int min){
        
        if(max == 0 || min == 0){

            return max;
        }
        int res = min;
        while(min > 0){
          
          if(max % res == 0 && min % res == 0){
            break;
          }
          res--;

        }

        return res;
          
              

    }
    public int findGCD(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;




        for(int i = 0; i<nums.length; i++){

            if(nums[i] > max){

                max = nums[i];
            }
            if(nums[i] < min){

                min = nums[i];
            }
        }

        


        return gcd(max,min);
        
    }
}