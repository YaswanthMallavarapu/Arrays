package Arrays.Arrays;

import java.util.HashMap;

public class LargestSubarrayWithGivenSum {

    public static int largest(int nums[],int target){
        int n=nums.length;
        int longest=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int currSum=0;
        for(int i=0;i<n;i++){
        currSum+=nums[i];
        if(currSum==target){
            longest=Math.max(longest,i+1);
        }
        if(map.containsKey(currSum-target)){
            longest=Math.max(longest,i-map.get(currSum-target));
        }
        map.put(currSum,i);
        }
        return longest;
    }
   
}
