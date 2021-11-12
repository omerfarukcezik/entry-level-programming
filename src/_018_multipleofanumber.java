public class _018_multipleofanumber {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b;

        System.out.println("A'yı giriniz:");
        a = kb.nextInt();

        System.out.println("B'yi giriniz:");
        b = kb.nextInt();

        if (a > b)
            System.out.println("Büyük olan sayı :" + a);
        else
            System.out.println("Büyük olan sayı :" + b);

    }
}
