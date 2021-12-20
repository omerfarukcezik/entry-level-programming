//klavyeden girilen sayıdan küçük tek ve çift dizi elemanlarının toplamlarını ve adetlerini ekrana yazdıran program
public class _016_lessonpractic {
    public static void main(String[] args) {
            int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
            java.util.Scanner kb = new java.util.Scanner(System.in);
            int i, size, n, countOdd, countEven, sumOdd, sumEven;
            size = 10;
            System.out.print("n'yi giriniz : ");
            n = kb.nextInt();
            countOdd = 0;
            countEven = 0;
            sumOdd = 0;
            sumEven = 0;
            for (i = 0; i < size; i = i + 1)
                if (a[i] < n)
                    if (a[i] % 2 != 0)
                    { countOdd = countOdd + 1; sumOdd = sumOdd + a[i]; }
                    else
                    { countEven = countEven + 1; sumEven = sumEven + a[i]; }
                    System.out.println("Teklerin toplamı : " + sumOdd + " adedi : " + countOdd);

    }


}
