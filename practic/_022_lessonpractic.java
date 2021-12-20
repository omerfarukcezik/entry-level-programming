//dizinin son n adet elemanını sondan başa doğru yazdıran program
// buna göre n 4 girildiğinde sırasıyla 17 5 20 ve 21 yazdırılacak
public class _022_lessonpractic {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n, size ;

        size = 10;

        System.out.println("n değeri giriniz: ");

        n = kb.nextInt();

        for (i = size - 1; i >= size - n; i = i - 1)

            System.out.print(a[i] + " ");

    }
}
