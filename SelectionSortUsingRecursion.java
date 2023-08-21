import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int []arr={5,10,2,3,7,8};
        sort(arr, 0, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int []arr,int s,int large,int e){
        if(e==0){
            return;
        }
        if(s<e){
            if(arr[s]>arr[large]){
                sort(arr, s+1, s, e);
            }       
            else{
                sort(arr, s+1, large, e);
            }
        }
        else{
            int temp=arr[large];
            arr[large]=arr[e-1];
            arr[e-1]=temp;
            sort(arr, 0, 0, e-1);
        }
    }
    }    
