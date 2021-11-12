public class _020_absolutevalue {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a;

        System.out.println("A'yı giriniz:");
        a = kb.nextInt();

        if (a < 0)
            a = a * -1;
        System.out.println("Mutlak değeri:" + a);

    }
}
