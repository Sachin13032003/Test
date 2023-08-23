import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //permutation("", "abc");
        ArrayList<String> arr=permutations("", "abc");
        System.out.println(arr);
        
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String s=p.substring(0, i);
            String f=p.substring(i,p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permutations(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch =up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String s=p.substring(0, i);
            String f=p.substring(i,p.length());
            ans.addAll(permutations(f+ch+s, up.substring(1)));
        }
        return ans;
    
}
}
