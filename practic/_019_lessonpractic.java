//dizinin ortalamasından küçük dizi elemanlarını
// ekrana yazdıran program
public class _019_lessonpractic {public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    int  i, size ,count ,sum ,avg;
    size = 10;
    sum = 0;
    avg = 0;

    for (i = 0; i < size; i = i + 1)
            sum = sum + a[i];
            avg = sum / size;

    for (i = 0; i < size; i = i + 1)
        if (a[i] < avg)
            System.out.print(a[i] + " ");

}
}
