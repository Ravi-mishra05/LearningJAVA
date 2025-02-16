package T11_Recursion;

public class C4_factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return fact(n - 1) * n;
    }
}
