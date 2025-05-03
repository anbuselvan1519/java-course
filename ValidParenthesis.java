import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        generate(n, 0, 0, "");
    }

    public static void generate(int n, int open, int close, String s) {
        if (s.length() == n * 2) {
            System.out.println(s);
            return;
        }

        if (open < n) {
            generate(n, open + 1, close, s + "(");
        }

        if (close < open) {
            generate(n, open, close + 1, s + ")");
        }
    }
}
