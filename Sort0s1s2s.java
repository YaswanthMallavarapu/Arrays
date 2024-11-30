public class Sort0s1s2s{
    public static void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static void sort(int nums[]){
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,1,2,0,2,1,0,2,0};
        System.out.println("before swap");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        sort(nums);
        System.out.println("\nafter swap");
        for (int i : nums) {
            System.out.print(i+" ");
        }

}
}