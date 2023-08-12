import java.util.Scanner;
public class Armstrong1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        arm(a);
        
    }
    static void arm(int p){
        int rem=0,sum=0;
        int temp=p;
        while(p>0){
            rem=p%10;
            int cub=rem*rem*rem;
            sum+=cub;
            p/=10;
        }
        if(temp==sum){
            System.out.println(temp+" "+ "is a armstrong number");
        }
        else{
            System.out.println(temp+" "+"is not a armstrong number");
        }
    }
}


    






