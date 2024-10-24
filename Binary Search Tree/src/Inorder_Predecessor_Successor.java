import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//////    Predecessor and Successor using inorder array
public class Inorder_Predecessor_Successor {
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
    public static TreeNode predecessor(TreeNode root, int x){
        List<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        int i = 0 ;
        while(arr.get(i).val!=x) i++;
        return arr.get(i-1);
    }
    public static TreeNode successor(TreeNode root, int x){
        List<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        int i = 0 ;
        while(arr.get(i).val!=x) i++;
        return arr.get(i+1);
    }
    public static void inorder(TreeNode root, List<TreeNode> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
}
