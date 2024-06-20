public class Greatestcommonfactor {
    public static void main(String[] args) {
        int a = 4;
        int b = 6 ;
        int result = Math.min(a,b);
        while (result>0){
            if(a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        System.out.println(result);
    }
}
