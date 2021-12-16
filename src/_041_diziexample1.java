//5 elemanlı a dizisine 2 den başlayan çift sayıları atayan program
public class _041_diziexample1 {
    public static void main(String[] args) {
        int a[] = new int [5];
        int i;

        for (i = 0 ; i < 5 ; i = i + 1)
            a[i] = (i + 1) * 2;
            for (i = 0 ; i < 5 ; i = i + 1)

            System.out.print(" " + a[i]);

    }
}
