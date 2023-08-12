public class LinearatString {
    public static void main(String[] args) {
        String c="Sachin";
        char target='b';
        boolean a=linear(c, target);
        System.out.println(a);

        
    }
    static boolean linear(String a,char target){
        if(a.length()==0){
            return false;
        }
        for(char i:a.toCharArray()){
            if(i==target){
                return true;
            }
        }
        return false;
    }
    
}
