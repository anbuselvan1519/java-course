public class ReverseStringRecurse {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(rrs(s, s.length() - 1));
    }

    public static String rrs(String s, int n) {
        if (n < 0) { 
            return "";
        }
        return s.charAt(n)+rrs(s, n - 1); 
    }
}