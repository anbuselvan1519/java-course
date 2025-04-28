public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        Emp emp = new Emp();
        Head head = new Head();
        polymorphism.greeting();
        emp.greeting();
        head.greeting();

    }

    public void greeting() {
        System.out.println("Hi");
    }
}

class Emp extends Polymorphism {
    @Override
    public void greeting() {
        System.out.println("Hi employee");
    }
}

class Head extends Polymorphism {
    @Override
    public void greeting() {
        System.out.println("Hi from Management");
    }
}