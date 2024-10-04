public class SumofNodeTree {
    public static void main(String[] args) {
        Nodes a = new Nodes(1);  // a is root Node
        Nodes b = new Nodes(4);
        Nodes c = new Nodes(3);
        Nodes d = new Nodes(2);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(5);

        a.left = b ; a.right = c ;
        b.left = d; b.right = e ;
        c.right = f;

        System.out.println(SumofNodes(a));
    }
    public static int SumofNodes(Nodes root){
        if(root==null) return 0 ;
        int sum = 0;
        sum = root.val+SumofNodes(root.left)+SumofNodes(root.right);
        return sum ;
    }
}
