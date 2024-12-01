import java.util.ArrayList;

public class RearrangingArrayOnOrder{ 
    public static int[] rearrange(int nums[]){
        int n=nums.length;
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();

        for(int i=0;i<n;i++){
           if(nums[i]<0){
            neg.add(nums[i]);
           }
           else{
            pos.add(nums[i]);
           }
        }
        int ans[]=new int[n];
        int n1=pos.size();
        int m=neg.size();
        int commonLen=Integer.min(pos.size(),neg.size());
        int index=0;
       for(int i=0;i<commonLen;i++){
        ans[index++]=pos.get(i);
        ans[index++]=neg.get(i);
       }
       for(int i=commonLen;i<n1;i++){
        ans[index++]=pos.get(i);
       }
       for(int i=commonLen;i<m;i++){
        ans[index++]=neg.get(i);
       }

       return ans;
    }
    public static void main(String[] args) {
        int arr[]={-5,-3,1,-2,-2,3};
        System.out.println("before");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        int ans[]=rearrange(arr);
        System.out.println("\nafter");
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
}