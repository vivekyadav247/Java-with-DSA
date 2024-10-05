public class TraversalofBinaryTree {
    public static void main(String[] args) {
        Nodes a = new Nodes(1);  // a is root Node
        Nodes b = new Nodes(41);
        Nodes c = new Nodes(3);
        Nodes d = new Nodes(2);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(10);
        Nodes g = new Nodes(6);
        Nodes h = new Nodes(20);

        a.left = b ; a.right = c ;
        b.left = d ; b.right = e ;
        c.left = f ; c.right = g ;
        f.left = h;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
    /// Preorder Traversal
    public static void preorder(Nodes root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    /// Inorder Traversal
    public static void inorder(Nodes root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    /// Postorder Traversal
    public static void postorder(Nodes root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
