//klavyeden s ve n giriliyor dizinin s nolu elemanından başlayarak n adet elemanını ekrana yazdıran program

public class _023_lessonpractic {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n, size, s;

        size = 10;

        System.out.println("N değeri giriniz: ");

        n = kb.nextInt();

        System.out.println("S değeri giriniz: ");

        s = kb.nextInt();

        for (i = s; i < s + n; i = i + 1)

            System.out.print(a[i] + " ");

    }
}
