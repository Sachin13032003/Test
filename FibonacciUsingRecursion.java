import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number til what you want to see the fibonacci number");
        int n=sc.nextInt();
        System.out.println("The Series of fibonacci number is:- ");
        for (int i = 0; i <=n; i++) {
             System.out.println(fibo(i));
        } 
    }
    static int fibo(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));

    }
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
       
    }
    
}
