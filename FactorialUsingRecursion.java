public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int ans=factorial(5);
        System.out.println(ans);
        int sum=sumofnumbers(5);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n<=1){
        return 1;
               }
       return n*factorial(n-1);
    }
     static int sumofnumbers(int n){
        if(n<=1){
        return 1;
               }
       return n+sumofnumbers(n-1);
    } 
}
