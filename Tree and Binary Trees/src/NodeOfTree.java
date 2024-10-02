class Nodes{
    int val;
    Nodes left ;
    Nodes right ;
    Nodes(int val){
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Nodes a = new Nodes(1);  // a is root Node
        Nodes b = new Nodes(41);
        Nodes c = new Nodes(3);
        Nodes d = new Nodes(2);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(5);

        a.left = b ; a.right = c ;
        b.left = d; b.right = e ;
        c.right = f;

        display(a);
    }
    private static void display(Nodes root){
        if(root==null) return ;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}