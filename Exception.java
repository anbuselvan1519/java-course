import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        try {
            if(n<0){
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("dont give negative number");
        }
        }
    }
