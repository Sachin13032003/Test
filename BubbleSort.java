import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int []a={5,4,3,54,0,1};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void selectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
             int last=arr.length-i-1;
             int maxIndex=getMaxIndex(arr,0,last);
             swaped(arr, maxIndex, last);
        }
    }
    static void insertionSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swaped(arr, j, j-1);
                }
            }
        }
    }
    static int getMaxIndex(int []arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swaped(int []arr,int first ,int last){
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
        }
    static void bubblesort(int []arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap =false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap){
              break;
           }
        }
    }
    static void display(int []a){
        System.out.println(Arrays.toString(a));
    }
} 
