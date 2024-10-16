import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal4 {
    public static class Pair{
        Nodes node ;
        int level ;
        Pair(Nodes node , int level){
            this.node = node ;
            this.level = level ;
        }
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

        System.out.println("Level Order : ");
        levelordertrvsl(a);
    }
    public static void levelordertrvsl(Nodes root){
        int prelvl = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair p = q.remove();
            Nodes front = p.node ;
            int lvl = p.level ;
            if(lvl!=prelvl){
                System.out.println();
                prelvl++;
            }
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(new Pair(front.left,lvl+1));
            if(front.right!=null) q.add(new Pair(front.right,lvl+1));
        }
    }
}
