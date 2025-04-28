public class Encapsulation {
    public static void main(String[] args) {
        Test test = new Test(22);
        System.out.println("The current a is " + test.geta());
        System.out.println(test.b);
        test.seta(23);
        System.out.println("The a after set " + test.geta());
    }
}

class Test {
    private int a;
    int b;

    Test(int a) {
        this.a = a;
    }

    public int geta() {
        return a;
    }

    public void seta(int a) {
        this.a = a;
    }
}
