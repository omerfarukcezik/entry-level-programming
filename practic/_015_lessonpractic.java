//klavyeden girilen sayıdan küçük ve tek olan
// dizi elemanlarını ekrana yazdıran program
public class _015_lessonpractic {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, n;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        size = 10;

        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0)
             if (a[i] < n)
                System.out.println(a[i]);

    }
}
