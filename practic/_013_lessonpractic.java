//dizide ki tek sayıları tek sayıların adedini toplamını ve
// ortalamasını ekrana yazdıran program
public class _013_lessonpractic {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, count, sum, avg;
        size = 10;
        count = 0;
        sum = 0;
        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
                count = count + 1;
                sum = sum + a[i];

            }
        avg = sum / count;
        System.out.print("tek sayıların adeti eşittir : " + count);
        System.out.println(" Toplamı : " + sum + " Ortalaması : " + avg);



    }
}
