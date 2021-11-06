public class _004_Variableswap {
    public static void main (String[] args) {
        int a, b, c;
        a = 20;
        b = 10;

        c = a;
        a = b;
        b = c;

        System.out.println("A'nın değeri : " + a);
        System.out.println("B'nin değeri : " + b);

    }
}
