public class ReverseOfNumber {
    public static void main(String[] args) {
        reverse(1023);
        System.out.println(sum);
        int ans=reverse1(1234);
        System.out.println(ans);
    }
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
      
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        return (int) ((n%10)*Math.pow(10,digits-1))+helper(n/10,digits-1);

    }
    static int reverse1(int n){
        int digits=(int) (Math.log10(n))+1;
        return helper(n, digits);
    }
}
