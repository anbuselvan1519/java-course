import java.util.*;

public class Switch{
    public static void main(String[] args) {
        menushow();
        boolean flag=false;
        while(!flag){
            System.out.print("enter number 1: ");
            int a=new Scanner(System.in).nextInt();
            System.out.print("enter number 2: ");
            int b=new Scanner(System.in).nextInt();
            System.out.println("enter the operation to be done");
            int n=new Scanner(System.in).nextInt();
            switch (n) {
                case 1:System.out.println("you have choosen addition");
                System.out.println(add(a,b));
                break;

                case 2:System.out.println("you have choosen subtraction");
                System.out.println(sub(a,b));
                break;

                case 3:System.out.println("you have choosen multipilcation");
                System.out.println(mul(a,b));
                break;

                case 4:System.out.println("you have choosen division");
                System.out.println(div(a,b));
                break;

                case 5:System.out.println("you have choosen modulo");
                System.out.println(mod(a,b));
                break;

                case 6:
                flag=true;
                System.out.println("you have exited!");
                break;

                default:System.out.println("you have entered a invalid number");
                    break;
            }
        }
    }

    public static void menushow(){
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.modulo");
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static int mod(int a, int b){
        return a%b;
    }
}
