public class SimpleInterest {
    public static void main(String[] args) {
        int principle = 600000 ;
        float rate = 8f ;
        float time = 1f ;
        double SI = principle * rate * time / 100 ;
        System.out.println("Simple Interest is : "+SI);
    }
}
