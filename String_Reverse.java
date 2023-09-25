import java.util.Scanner;
public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String s =sc.nextLine();
        String srev="";
        for (int i = s.length()-1; i >=0; i--) {
            srev=srev+s.charAt(i);
        }
        System.out.println("Reverse String is - "+srev);
    }
    
}
