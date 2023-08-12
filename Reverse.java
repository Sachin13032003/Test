public class Reverse {
    public static void main(String[] args) {
        int a=12345,b=0;
        int rem=0;
        while(a>0){
            rem=a%10;
            b=b*10+rem;
            a=a/10;
        }
        System.out.println("the reverse number of "+a+"is"+b);
    }
    
}
