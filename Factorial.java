public class Factorial {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int n){
        int fact=1;
        if(n>0){
            fact=n*f(n-1);
        }
        return fact;
    }
}
