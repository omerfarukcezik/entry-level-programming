//klavyeden girilen sayıdan küçük dizi elemanlarını ekrana yazdıran program
public class _014_lessonpractic {
        public static void main(String[] args) {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
            int i, size, n;

            System.out.print("Bir sayı giriniz : ");
            n = kb.nextInt();

            size = 10;

            for (i = 0; i < size; i = i + 1) {
                if (a[i] < n)
                    System.out.println(a[i]);
            }

    }
}
