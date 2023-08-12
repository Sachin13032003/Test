public class Pattern {
    public static void main(String[] args) {
        pattern4(5);
        
    }
    static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col<=n-row+1; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    } 
     static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col<=row; col++) {
                System.out.print(col+" ");
                
            }
            System.out.println();
            
        }
    }   
     static void pattern3(int n){
        for (int row = 1; row <2*n; row++) {
            int colime= row>n ?2*n-row:row;
            for (int col = 1; col<=colime; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }  
     static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space <=n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col<=row; col++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }          
}
