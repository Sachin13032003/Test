public class SearchUsingRecursion{
    public static void main(String[] args) {
        int []arr={1,4,7,9,10,15};
        System.out.println(search(arr, 20, 0));
   }
    static int search(int []arr,int target,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
        return search(arr,target,index+1);
    }
}
}