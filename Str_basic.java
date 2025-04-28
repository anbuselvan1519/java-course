public class Str_basic {
    public static void main(String[] args) {
        String name="hello madam";
        String name_1="hello";

        System.out.println(name==name_1);

        String name_2=new String();
        name_2="hello";

        String name_3="Hello";
        System.out.println("Shallow search output "+ (name==name_2));

        System.out.println("deep search output is "+ name.equals(name_2));

        System.out.println(name.compareTo(name_3));

        System.out.println(name.endsWith("madam"));

        System.out.println(name.startsWith("hello"));
    }
}
