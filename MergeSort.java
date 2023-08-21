import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        //arr=sort(arr);
        //System.out.println(Arrays.toString(arr));
        sortInPlace(arr, 0,arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    static int[] sort(int []arr){
        if(arr.length==1){
            return arr;
        }
        int  mid= arr.length/2;
        int []left=sort(Arrays.copyOfRange(arr,0, mid));
        int []right=sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    private static int[] merge(int []first,int []second){
        int i=0,j=0,k=0;
        int []mix =new int[first.length+second.length];
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    //without creating an different array and modifying the real array
static void sortInPlace(int []arr,int s,int e){
        if(e-s==1){
            return;
        }
        int  mid= s+(e-s)/2;
        sortInPlace(arr,s, mid);
        sortInPlace(arr, mid, e);
        mergeInplace(arr,s,mid,e);
    }
    private static void mergeInplace(int []first,int s,int m, int e){
        int i=s,j=m,k=0;
        int []mix =new int[e-s];
        while(i<m && j<e){
            if(first[i]<first[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=first[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=first[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            first[l+s]=mix[l];
        }
    }
}
