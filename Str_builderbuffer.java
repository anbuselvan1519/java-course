public class Str_builderbuffer {
    public static void main(String[] args) {
        int n = 100000;

        // StringBuilder timing
        long start = System.currentTimeMillis();
        String s = new String();
        for (int i = 0; i < n; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start) + " ms");

        // StringBuffer timing
        long start2 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end2 - start2) + " ms");

        // StringBuilder timing
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end1 - start1) + " ms");
    }
}

