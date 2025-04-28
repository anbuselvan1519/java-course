public class RecursionBasic {
    public static void main(String[] args) {
        rb(5);
}
public static void rb(int n){
    if(n<3){
        return;
    }
    rb(n-1);
    System.out.println(n);
}
}
