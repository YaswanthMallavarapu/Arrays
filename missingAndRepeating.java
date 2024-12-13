Approach 1:
   
class Solution {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
       
        
        long sn=n*(n+1)/2;
        long s2n=n*(n+1)*(2*n+1)/6;
        long s=0;
        long s2=0;
        
        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+=(arr[i]*arr[i]);
        }
        
        long val1=s-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        
        int x=(int) (val1+val2)/2;
        int y=(int) val1-x;
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(x);
        ans.add(y);
        return ans;
    }
}

Approach 2:
class Solution {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n=arr.length;
        int missing=-1;
        int repeating=-1;
        int count[]=new int[n+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==2)repeating=i;
            if(count[i]==0)missing=i;
            if(repeating!=-1 && missing!=-1){
                break;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        return ans;
    }
}