import java.util.*;
import java.io.*;
public class Odd_even {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7,8};
        int i=0;
        while(i<arr.length && arr[i]%2==0){
                i++;
            }
        for(int j=i;j<arr.length;j++){
            if(arr[j]%2!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println("new array is "+Arrays.toString(arr));
    }
    
}
