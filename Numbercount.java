public class Numbercount {
    public static void main(String[] args) {
        int a=1234556;
        int count =0;
        while(a>0){
            int rem=a%10;
            if(rem==5){
                count++;
            }
            a=a/10;

        }
        System.out.println("The total number of 5 present in number is "+count);
    }
    
}
