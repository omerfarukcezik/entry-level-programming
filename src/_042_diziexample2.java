//dizinin elemanlarının toplamının ortalamasını ekrana yazdıran program 4, 8, 3, 1, 18, 9, 21, 20, 5, 17
public class _042_diziexample2 {
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, sum, avg;

        sum = 0;

        for (i = 0 ; i < 10 ; i = i + 1)
            sum = sum + a[i];
        System.out.println("Toplam = " + sum);

        avg = sum / 10;
        System.out.print("Ortalması = " + avg);


    }
}
