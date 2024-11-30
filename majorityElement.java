    class Solution {
        public int majorityElement(int[] nums) {
            int n=nums.length;
            int majorityElement=-1;
            int count=0;
           for(int i=0;i<n;i++){
               if(count==0){
                majorityElement=nums[i];
                count=1;
               }
               else if(nums[i]==majorityElement){
                count++;
               }
               else{
                count--;
               }
           }
           return majorityElement;
        }
    }

