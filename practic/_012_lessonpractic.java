//dizide ki tek sayıları ve tek  sayıların adedini ekrana yazdıran program
public class _012_lessonpractic  {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, count;
        size = 10;
        count = 0;
        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
                count = count + 1;

            }
         System.out.println("tek sayıların adeti eşittir : " + count);
    }
}