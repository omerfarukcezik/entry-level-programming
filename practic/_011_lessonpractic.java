//dizide ki tek sayıları ekrana yazdıran program
public class _011_lessonpractic {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size;
        size = 10;
        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0)
                System.out.println(a[i]);


    }
}
