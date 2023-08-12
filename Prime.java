import java.util.Scanner;
public class Prime {
    private static final Readable Scanner = null;

    public static void main(String[] args) {
        int n,i;
        int flag=0;
        Scanner sc=new Scanner(Scanner);
        System.out.println("Enter the number:- ");
        n=sc.nextInt();
        int m=n/2;
        if(n==0 || n==1){
            System.out.println("The number is not prime");
        }
        else{
            for (i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("The number is not prime");
                    flag=1;
                    break;
                }
            }
                if(flag==0){
                     System.out.println("the number is prime");
                    
                }
            
        }
    }
}
                
   

    // if(n==0||n==1){  
    //     System.out.println(n+" is not prime number");      
    //    }else{  
    //     for(i=2;i<=m;i++){      
    //      if(n%i==0){      
    //       System.out.println(n+" is not prime number");      
    //       flag=1;      
    //       break;      
    //      }      
    //     }      
    //     if(flag==0)  { System.out.println(n+" is prime number"); }  
    //    }//end of else  
    //  }    
    //  }  
    

