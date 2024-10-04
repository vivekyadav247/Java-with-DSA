public class LevelandHeightofBinaryTree {
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

        System.out.println(level(a));
        int height = level(a) - 1 ;
        System.out.println(height);
    }
    public static int level(Nodes root){
        if(root==null) return 0 ;
        return 1+Math.max(level(root.left),level(root.right));
    }
}
