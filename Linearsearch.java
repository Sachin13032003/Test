public class Linearsearch {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,7,8,9};
        int target=30;
        int ans=linear1(a, target);
        System.out.println("The element present at"+ans+"index");
        
    }
    static  int linear1(int []arr,int target){
       if(arr.length==0){
        return -1;
       }
       for(int i:arr){
        if(target==i){
            return i;
       }
    }
    return -1;
    
}
}
