public class Nqueens {
    public static void main(String[] args) {
        int n=4;
         boolean [][] board=new boolean[n][n];
         System.out.println("Total no of solutions will be:- ");
          System.out.println( queens(board, 0));
    }
    static int queens(boolean [][]board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen in row and col
        for (int col = 0;col < board.length; col++) {
            //place the queen if it is safe
            if(issafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board, row+1);
                 board[row][col]=false;
            }
        }
        return count;
    }
    private static boolean issafe(boolean[][] board,int row,int col){
         //check vertical row
         for (int i = 0; i <row; i++) {
            if(board[i][col]){
                  return false;
            }
        }
            //check diagonal left
            int maxleft=Math.min(row, col);
            for (int j = 1; j <= maxleft; j++) {
                if(board[row-j][col-j]){
                    return false;
                }
            }
            //check diagonal right
            int maxright=Math.min(row, board.length-col-1);
            for (int k = 1; k <= maxright; k++) {
                if(board[row-k][col+k]){
                    return false;
                }
            }
           return true;
         }
    private static void display(boolean[][]board){
       for(boolean[] row: board){
        for(boolean element: row){
            if(element){
                System.out.print("Q ");
            }
            else{
                System.out.print("X ");
            }
        }
        System.out.println();
       }
    }
}
   


