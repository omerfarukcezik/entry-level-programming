public class _022_bigsmallnumber {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b;

        System.out.println("a'yı giriniz : ");
        a = kb.nextInt();
        System.out.println("b'yi giriniz : ");
        b = kb.nextInt();

        if (a > b)
            System.out.println(a + ">" + b);
        else

            if (a == b)
                System.out.print(a + "=" + b);
            else
                System.out.println(a + "<" + b);
    }
}
