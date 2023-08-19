public class SumofDigits {
    public static void main(String[] args) {
        int ans= sum(1342);
        System.out.println(ans);
        int ans1= product(1342);
        System.out.println(ans1);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10)+(n%10);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return product(n/10)*(n%10);
    }
    
}
