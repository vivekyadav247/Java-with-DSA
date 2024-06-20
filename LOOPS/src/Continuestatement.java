public class Continuestatement {
    public static void main(String[] args) {

        // 100 iteration or round //
//        for(int i=1;i<=100;i++){
//            if(i%2!=0) System.out.println(i+" ");
//        }

        // 50 iteration //
//        for(int i=1;i<=100;i+=2){
//            System.out.println(i+" ");
//        }

        // Continue statement // 100 iteration
        for(int i=1;i<=100;i++){
            if(i%2==0) continue ;
            System.out.println(i);
        }
    }
}
