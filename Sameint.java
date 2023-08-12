import java.util.Scanner;
public class Sameint {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your number");
        int a=in.nextInt();
        System.out.println("Enter your number");
        int b=in.nextInt();
        System.out.println("Enter your number");
        int c=in.nextInt();
        System.out.println("Enter your number");
        int d=in.nextInt();
        if(a==b&&a==c&&a==d){
            System.out.println("you entered four same number");
        }
        else{
            System.out.println("you entered wrong number");
        }

    }
    
}
