package Arrays.Arrays;
// optimal solution
class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
    int reqSum=(n*(n+1))/2;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
    }
    return reqSum-sum;
    }
    
}

// better solution
// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=nums.length;
//         int contain[]=new int[n+1];
//         for(int i=0;i<n;i++){
//             contain[nums[i]]=1;
//         }
//         for(int i=0;i<n+1;i++){
//             if(contain[i]==0){
//                 return i;}
//         }
//         return -1;
//     }
// }