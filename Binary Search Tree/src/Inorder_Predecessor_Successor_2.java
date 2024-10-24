import java.util.List;
import java.util.Scanner;

public class Inorder_Predecessor_Successor_2 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(50);  // a is root Node
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(70);
        TreeNode d = new TreeNode(20);
        TreeNode e = new TreeNode(40);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(80);
        a.left = b ; a.right = c ;
        b.left = d; b.right = e ;
        c.left = f; c.right = g ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to find his Predecessor and Successor : ");
        int x = sc.nextInt();
        System.out.println("Predecessor : "+predecessor(a,x).val);
        System.out.println("Successor : "+successor(a,x).val);
    }
    static TreeNode prev ;
    public static TreeNode predecessor(TreeNode root, int x){
        if(root==null) return null ;
        prev = root;
        predecessor(root.left,x);
        if(root.val==x) return prev;
        predecessor(root.right,x);
        return null;
    }
    public static TreeNode successor(TreeNode root, int x){
        if(root==null) return null ;
        prev = root;
        successor(root.left,x);
        if(prev.val==x) return root;
        successor(root.right,x);
        return root;
    }
}
