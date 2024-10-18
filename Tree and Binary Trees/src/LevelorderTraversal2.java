import java.util.Scanner;

public class LevelorderTraversal2 {

    // LEVEL ORDER TRAVERSAL USING NTH LEVEL ( WITHOUT USING QUEUE )
    static int n ;
    public static int level(Nodes root){
        if(root==null) return 0 ;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Nodes a = new Nodes(1);  // a is root Node
        Nodes b = new Nodes(2);
        Nodes c = new Nodes(3);
        Nodes d = new Nodes(4);
        Nodes e = new Nodes(5);
        Nodes f = new Nodes(6);
        Nodes g = new Nodes(7);
        Nodes h = new Nodes(8);

        a.left = b ; a.right = c ;
        b.left = d ; b.right = e ;
        c.left = f ; c.right = g ;
        g.left = h;

        levelordertravsl(a);
    }
    public static void levelordertravsl(Nodes root){
        for (int i = 0; i < level(root); i++) {
            n = i ;
            nthlevel(root,0);
            System.out.println();
        }
    }
    public static void nthlevel(Nodes root, int level){
        if(root==null) return ;
        if(level==n) System.out.print(root.val+" ");
        nthlevel(root.left,level+1);
        nthlevel(root.right,level+1);
    }
}
