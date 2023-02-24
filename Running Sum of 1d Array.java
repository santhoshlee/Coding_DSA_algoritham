class Solution {

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    public int[] runningSum(int[] nums) {
        
        //getting size of the array
        int n = nums.length;

        //return array declaration
        int[] rtr_nums = new int[n];

        for(int i=0;i<n;i++) {

             //first element
                if(i==0) {
                    rtr_nums[i] = nums[i];
                }

               //for itrate       
               int temp = 0;

                for(int j=0;j<=i;j++) {
                   temp = temp + nums[j];
                 }

                if(i!=0) {
                    rtr_nums[i] = temp;
                }
          
        }

        return rtr_nums;

    }
}