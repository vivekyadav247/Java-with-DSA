public class modifyChaaracterInstring {
    public static void main(String[] args) {
        String s = "Hello";
        // Heylo me change karna hai
        // 2nd index change to y
        s = s.substring(0,2)+'y'+s.substring(3);
    }
}
// In memory Hello pehle se hi ek string hai it is always stored in memory
// "He"+"y" (This is also create a String it is also stored in memory)
// "Hey" + "lo" (This is also create a String it is also stored in memory)
// "Heylo" (This is also create a String it is also stored in memory)