public class productofNon_Zeroele {
    public static void main(String[] args) {
        Nodes a = new Nodes(1);  // a is root Node
        Nodes b = new Nodes(4);
        Nodes c = new Nodes(0);
        Nodes d = new Nodes(2);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(5);

        a.left = b ; a.right = c ;
        b.left = d; b.right = e ;
        c.right = f;

        System.out.println(productofnonzero(a));
    }
    public static int productofnonzero(Nodes root){
        if(root==null) return 1 ;
        if(root.val==0) return 1;
        return root.val*productofnonzero(root.left)*productofnonzero(root.right);
    }
}
