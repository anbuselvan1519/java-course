public class FibonnaciSeries {
    public static void main(String[] args) {
        int n=100;
        for(int i=0;i<n;i++){
            System.out.println(fb(i));
        }
    }
    public static int fb(int n){
        if(n<=1){
            return n;
        }
        return fb(n-1)+fb(n-2);
    }
}
