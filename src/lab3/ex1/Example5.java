package lab3.ex1;

public class Example5 {

    private static int depth = 0;

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        printWithIndent("fib(" + n + ")");
        depth++;
        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fib(n - 2) + fib(n - 1);
        }
        depth--;
        return result;
    }

    private static void printWithIndent(String text) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(text);
    }
}
