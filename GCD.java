public class GCD {
    public static void main(String[] args) {
        int a=48;
        int b=18;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int i,int j) {
        if(j==0){
            return i;
        }
        return gcd(j,i%j);
    }
}
