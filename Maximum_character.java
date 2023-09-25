public class Maximum_character {
    public static void main(String[] args) {
        String s= "aabbbcccccc";
        int []a =new int[127];
        for (int i = 0; i < s.length()-1; i++) {
            a[s.charAt(i)]=a[s.charAt(i)]+1;
        }
        char c=' ';
        int max= -1;
        for (int j = 0; j < s.length(); j++) {
            if(max<a[s.charAt(j)]){
                max=a[s.charAt(j)];
                c=s.charAt(j);
            }
        }
        System.out.println("Maximum occured charcter is :-"+c);
    }
    
}
