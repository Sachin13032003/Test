public class Minlinear {
    public static void main(String[] args) {
        int []arr={10,3,4,7,-4};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("the minimum element in the array is"+min);
    }
    
}
