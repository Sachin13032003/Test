public class Ceilling {
    public static void main(String[] args) {
        int []arr={-11,-2,-1,10,20,34,56,88,98};
        int ans=binary(arr, 80);
        System.out.println(ans);

    }
    static int binary(int []a,int target){
        int st=0,end=a.length,mid;
        while(st<=end){
        mid=(st+end)/2;
        if(target<a[mid]){
            end=mid-1;
        }
        else if(target>a[mid]){
            st=mid+1;
        }
        else if( target==a[mid]){
            return mid;
        }
    }
    return st;

}
    
}

