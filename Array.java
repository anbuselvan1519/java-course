
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n=0;
        int sign=0;
        int [] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[n++]= new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]!=a[i+1]){
                sign=a[i+1]-a[0];
            }
        }
                if(sign<0){
                    System.out.println("array is not increasing");
                }
                else{
                    System.out.println("array is increasing");
                }
        }
    }
