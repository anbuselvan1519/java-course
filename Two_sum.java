import java.util.*;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr=new int[] {2,7,11,15};
        int t=9;
        HashMap<Integer,Integer> m= new HashMap();
        
        //optimised
        for(int i=0;i<arr.length;i++){
            int v=arr[i];
            int diff=t-v;
            if (m.containsKey(v)){
                System.out.println(m.get(v)+":"+i);
            }
            else{
                m.put(diff,i);
            }
        }

        //brute force
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println(i + ":" + j); 
                    return;
                }
            }
        }
    }
}
