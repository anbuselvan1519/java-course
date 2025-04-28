public class String_finder {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he6llo";

        int xor = 0;
        for (int i = 0; i < Math.max(s1.length(), s2.length()); i++) {
            if (i < s1.length()) xor ^= s1.charAt(i);
            if (i < s2.length()) xor ^= s2.charAt(i);
        }
        System.out.println((char) xor);
    }
}
