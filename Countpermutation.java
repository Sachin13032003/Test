public class Countpermutation {
    public static void main(String[] args) {
        System.out.println(permutations("", "abcd"));
    }
    static int permutations(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch =up.charAt(0);
        int count=0;
        for (int i = 0; i <=p.length(); i++) {
            String s=p.substring(0, i);
            String f=p.substring(i,p.length());
            count=count+permutations(f+ch+s, up.substring(1));
        }
        return count;
    }
    
}
