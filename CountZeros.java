public class CountZeros {
public static void main(String[] args) {
    int ans=zero(10024);
    System.out.println(ans);    
}  
static int zero(int n){
    return helper(n,0);
}  
private static int helper(int n,int count){
    if(n==0){
        return count;
    }
     if(n%10==0){
        return helper(n/10,count+1);
    }
    else{
        return helper(n/10, count);
    }

}}
