public class NodewithMaxValue {
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

        System.out.println(nodemax(a));
    }
    public static int nodemax(Nodes root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(nodemax(root.left),nodemax(root.right)));
    }
}
