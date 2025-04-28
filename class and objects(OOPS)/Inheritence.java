class InheritenceParentClass {
    int age = 31;
}

class InheritenceChildClass extends InheritenceParentClass {
    int id = 123;
}

public class Inheritence {
    public static void main(String[] args) {
        InheritenceChildClass inheritenceChildClass = new InheritenceChildClass();
        System.out.println(inheritenceChildClass.age);
        System.out.println(inheritenceChildClass.id);
    }
}
