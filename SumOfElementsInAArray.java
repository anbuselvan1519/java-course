public class SumOfElementsInAArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int s=SumArray(arr,arr.length);
        System.out.println(s);
    }
    public static int SumArray(int[] arr,int n){
        if(n<=0){
            return 0;
        }
        return arr[n-1]+SumArray(arr,n-1);
    }
}
