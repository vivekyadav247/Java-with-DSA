import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    // Level Order Traversal (BFS) Using Queue
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

        System.out.print("Level Order : ");
        levelordertrvsl(a);
    }
    public static void levelordertrvsl(Nodes root){
        Queue<Nodes> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while (!q.isEmpty()){
            Nodes front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
}
