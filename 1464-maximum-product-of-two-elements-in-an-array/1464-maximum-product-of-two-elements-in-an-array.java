class Solution {
    public int maxProduct(int[] nums) {
      
       
       int n = nums.length;

       int ans = 0;
       //int pro = 0;

       for(int i = 0; i<n; i++){

           for(int j = 0; j<n; j++){

            if(i!=j){

            int  pro = (nums[i]-1)*(nums[j]-1);
            ans = Math.max(ans,pro);

            }

           }

           //ans = Math.max(ans,pro);
       }

       return ans;



    }
}
