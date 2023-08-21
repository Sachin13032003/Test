import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int []arr={2,7,4,6,10,45};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr,int s){
        if(s==arr.length-1){
            return;
        }
        if(arr[s]>arr[s+1]){
            int temp=arr[s];
            arr[s]=arr[s+1];
            arr[s+1]=temp;
            sort(arr, s+1);
        }
        else{
            sort(arr, s+1);
        }
        
    }
}
