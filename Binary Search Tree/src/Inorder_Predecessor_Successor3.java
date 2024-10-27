import java.util.Scanner;

public class Inorder_Predecessor_Successor3 {
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
        TreeNode[] predsuc = new TreeNode[2];
        predsuc[0] = null;
        predsuc[1] = null;
        findpredsuc(a,x,predsuc);
        System.out.println("Predecessor : "+((predsuc[0]!=null) ? predsuc[0].val : -1));
        System.out.println("Successor : "+((predsuc[1]!=null) ? predsuc[1].val : -1));
    }
    public static void findpredsuc(TreeNode root , int x, TreeNode[] predsuc){
        if(root==null) return ;
        if(root.val==x) {
            if(root.left!=null) {
                TreeNode pre = root.left;
                while (pre.right != null) pre = pre.right;
                predsuc[0] = pre;
            }
            if(root.right!=null) {
                TreeNode suc = root.right;
                while (suc.left != null) suc = suc.left;
                predsuc[1] = suc;
            }
            return ;
        }
        if(root.val>x) {
            predsuc[1] = root ;
            findpredsuc(root.left,x,predsuc);
        }
        else {
            predsuc[0] = root ;
            findpredsuc(root.right,x,predsuc);
        }
    }
}
