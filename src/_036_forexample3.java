//klavyeden a ve b giriliyor a ile b nin arasında ki 5 in katlarını ekrana
// yazdıran program
public class _036_forexample3 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int a, b, i;

        System.out.print("a'yı giriniz : ");
        a = kb.nextInt();
        System.out.print("b'yi giriniz : ");
        b = kb.nextInt();

        for (i = a + 1 ; i < b ; i = i + 1)
            if (i % 5 == 0)
                System.out.print(i + " ");
    }
}
