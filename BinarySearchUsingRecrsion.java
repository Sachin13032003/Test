public class BinarySearchUsingRecrsion {
    public static void main(String[] args) {
        int []arr={45,66,68,90,100,504,709};
        int target=66;
        int ans=search(arr, target,0,arr.length);
        System.out.println(ans);
        
    }
    static int search(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
       }
    
}
