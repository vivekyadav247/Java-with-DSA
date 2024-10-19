public class minandmaxinBST {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);  // a is root Node
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(13);
        TreeNode g = new TreeNode(19);

        a.left = b ; a.right = c ;
        b.left = d; b.right = e ;
        c.left = f; c.right = g ;

        System.out.println(maxofBST(a));
        System.out.println(minofBST(a));
    }
    public static int maxofBST(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        return maxofBST(root.right);
    }
    public static int minofBST(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        return minofBST(root.left);
    }
}
