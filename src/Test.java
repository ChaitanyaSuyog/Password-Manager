public class Test {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 0;
        if (a > b || a != b) c = ++a + --b;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
}
