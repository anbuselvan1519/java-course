
import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        StringBuilder sp= new StringBuilder(s);
        if(sp.toString().equals(sp.reverse().toString())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
