//klavyeden x ve y giriliyor xin y den küçük olduğu kabul ediliyor
// xden küçük dizi elemanları ile y den büyük dizi elemanlarını ekrana yazdıran program
public class _018_lessonpractic {
    public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    int x, y, i, size;
    System.out.print("x'i giriniz :");
    x = kb.nextInt();
    System.out.print("y'i giriniz :");
    y = kb.nextInt();

    size = 10;

    for (i = 0; i < size; i = i + 1)
        if (x > a[i])
            System.out.print(a[i] + " ");
           else if(y < a[i])
                System.out.print(a[i] + " ");


}
}
