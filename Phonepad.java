import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
       // pad("", "12");
       System.out.println(padrt("", "12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0)-'0';//convert '2' to 2 number
        for (int i = (digit-1)*3; i <digit*3; i++) {
        char ch=(char)('a'+i);
        pad(p+ch, up.substring(1));            
        }
    }
    static ArrayList<String> padrt(String p,String up){
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        int digit= up.charAt(0)-'0';//convert '2' to 2 number
        for (int i = (digit-1)*3; i <digit*3; i++) {
        char ch=(char)('a'+i);
        ans.addAll(padrt(p+ch, up.substring(1)));            
        }
        return ans;
    }
}
