import java.util.Scanner;
public class Double {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a double number");
        double a=sc.nextDouble();
        System.out.println("Enter second double number");
        double b=sc.nextDouble();
        System.out.println(a>0 && a<1 && b>0 && b<1);
}
}
