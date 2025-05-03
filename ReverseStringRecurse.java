public class ReverseStringRecurse {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(rrs(s, s.length() - 1));
    }

    public static String rrs(String s, int n) {
        if (n < 0) { 
            return "";
        }
<<<<<<< HEAD
        return s.charAt(n)+rrs(s, n - 1); 
=======
        return s.charAt(n) + rrs(s, n - 1); 
>>>>>>> e3c5b00fbb45d9c14f7a04516f398392b16fb9fe
    }
}