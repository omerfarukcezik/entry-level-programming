//klavyeden a ve b giriliyor a b ye eşit a b den büyük veya küçük olabilir
public class _035_forexample2 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, i;

        System.out.print("a yı giriniz : ");
        a = kb.nextInt();
        System.out.print("b yi giriniz : ");
        b = kb.nextInt();

        if (a < b)
            for (i = a ; i <= b ; i = i + 1)
                System.out.print(i + " ");
        else
            for (i = a; i >= b; i = i - 1)
                System.out.print(i + " ");

    }
}
