public class _008_calulate {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c, result;
        System.out.println("A'nın değerini giriniz : ");
        a = kb.nextInt();
        System.out.println("B'nin değerini giriniz : ");
        b = kb.nextInt();
        System.out.println("C'nin değerini giriniz : ");
        c = kb.nextInt();
        result = (3 * a * a * a ) + (4 * b * b) + (3 * c);
        System.out.println("Bu işlemin sonucu: " + result);

    }
}
