import java.util.Scanner;
public class Binarytree {
    public Binarytree(){

    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     Binarytree tree = new Binarytree();
     tree.populate(scanner);
     tree.prettyDisplay();

    }
    private int value;
    private static  class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value=value;
        }
    }
    private Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the value of root node:- ");
        int value=sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    private void populate(Scanner sc , Node node){
        System.out.println("Do you want to add the left of "+node.value);
        boolean left =sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left node of "+node.value);
            int value = sc.nextInt();
            node.left= new Node(value);
            populate(sc, node.left);
        }
         System.out.println("Do you want to add the right of "+node.value);
        boolean right =sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right node of "+node.value);
            int value = sc.nextInt();
            node.left= new Node(value);
            populate(sc, node.right);
        }
    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
      }
    
      private void prettyDisplay(Node node, int level) {
        if (node == null) {
          return;
        }
    
        prettyDisplay(node.right, level + 1);
    
        if (level != 0) {
          for (int i = 0; i < level - 1; i++) {
            System.out.print("|\t\t");
          }
          System.out.println("|------->" + node.value);
        } else {
          System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
      }
    
}
