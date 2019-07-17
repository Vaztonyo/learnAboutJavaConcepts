public class Overloading{

    public static void add(int a, int b){
        System.out.println(a + b);
        System.out.println("add method adding 2 int");
    }

    public static void add(int a, int b, int c){
        System.out.println(a + b + c);
        System.out.println("add method adding 3 int");

    }

    public static void add(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
        System.out.println("add method adding 4 int");

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";


        System.out.println(s1.equals(s2));
    }
}