import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllpaths {
    public static void main(String[] args) {
        boolean[][] arr={
            {true,true,true},
            {true,true,true},
            {true,true,true}
         };
         int [][]path=new int[arr.length][arr[0].length];
        // System.out.println(allpath("", arr, 0, 0));
        allpathprinting("", arr, 0, 0, path, 1);
         
        
    }
    static ArrayList<String> allpath(String p,boolean arr[][],int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!arr[r][c]){
             ArrayList<String> list2 =new ArrayList<>();
            return list2;
        }
        arr[r][c]=false;
         ArrayList<String> list1 =new ArrayList<>();
        if(r<arr.length-1){
            list1.addAll(allpath(p+'D',arr, r+1, c));
        }
        if(c<arr[0].length-1){
            list1.addAll(allpath(p+'R', arr,r, c+1));
        }
        if(r>0){
            list1.addAll(allpath(p+'U', arr, r-1, c));
        }
         if(c>0){
            list1.addAll(allpath(p+'L', arr, r, c-1));
        }
        arr[r][c]=true;
     return list1;
    }
    static void allpathprinting(String p,boolean arr[][],int r,int c,int [][]path,int step){
        if(r==arr.length-1 && c==arr[0].length-1){
            path[r][c]=step;
           for(int []arr1: path){
            System.out.println(Arrays.toString(arr1));
           }
           System.out.println(p);
           System.out.println();
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c]=false;
        path[r][c]=step;
        if(r<arr.length-1){
          allpathprinting(p+'D',arr, r+1, c,path,step+1);
        }
        if(c<arr[0].length-1){
            allpathprinting(p+'R', arr,r, c+1,path,step+1);
        }
        if(r>0){
            allpathprinting(p+'U', arr, r-1, c,path,step+1);
        }
         if(c>0){
            allpathprinting(p+'L', arr, r, c-1,path,step+1);
        }
        arr[r][c]=true;
        path[r][c]=0;
    }
    
}
