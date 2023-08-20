public class RBSUsingRecursion {
    public static void main(String[] args) {
        int []arr={5,6,7,8,9,1,2,3};
        int ans=search(arr, 10, 0, arr.length-1);
        System.out.println(ans);
    }
    static int search(int []arr,int target,int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(arr[s]<=target && target<=arr[m]){
                return search(arr, target, s, m);
            }
            else{
                return search(arr, target, m+1, e);
            }
        }
        if(arr[m]<=target && target<=arr[e]){
            return search(arr, target, m+1, e);
        }
        else{
            return search(arr, target, s, m-1);
        }
    }
    
}
