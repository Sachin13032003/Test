import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
       // System.out.println(combination(3, 3));
       //permutation("", 3, 3);
       //System.out.println(permutations("", 3, 3));
       boolean[][] arr={
          {true,true,true},
          {true,false,true},
          {true,true,true}
       };
       System.out.println(pathrestiction("", arr, 0, 0));
    }
    static int combination(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right=combination(r, c-1);
        int left=combination(r-1, c);
        return right+left;
    }
    static void permutation(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1 ){
            permutation(p+'d', r-1, c-1);
        }
        if(r>1){
            permutation(p+'D', r-1, c);
        }
        if(c>1){
            permutation(p+'R', r, c-1);
        }
    }
     static ArrayList<String> permutations(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
         ArrayList<String> list1 =new ArrayList<>();
        if(r>1 && c>1 ){
            list1.addAll(permutations(p+'d', r-1, c-1));
        }
        if(r>1){
            list1.addAll(permutations(p+'D', r-1, c));
        }
        if(c>1){
            list1.addAll(permutations(p+'R', r, c-1));
        }
        return list1;
    }
    static ArrayList<String> pathrestiction(String p,boolean arr[][],int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!arr[r][c]){
             ArrayList<String> list2 =new ArrayList<>();
            return list2;
        }
         ArrayList<String> list1 =new ArrayList<>();
        if(r<arr.length-1){
            list1.addAll(pathrestiction(p+'D',arr, r+1, c));
        }
        if(c<arr[0].length-1){
            list1.addAll(pathrestiction(p+'R', arr,r, c+1));
        }
        return list1;
    }
}
