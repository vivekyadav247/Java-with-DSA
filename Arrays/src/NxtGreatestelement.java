public class NxtGreatestelement {
    public static void main(String[] args) {
        int[] a = {12, 8, 41, 40, 60, 2, 49, 16, 28, 21};
        int n = a.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        int nge = a[n - 1];

        for(int i = n - 2; i >= 0; --i) {
            res[i] = nge;
            nge = Math.max(a[i], nge);
        }

        for(int ele : res){
            System.out.print(ele+" ");
        }

    }
}