//n klavyeden girilen pozitif bir sayıdır
//n çift ise 0 dan n ye kadar olan sayılar , n tek ise 1 den n ye kadar olan
//sayıları ekran yazdıran program
public class _034_forexample1 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        if (n % 2 == 0)
        for (i = 0 ; i <= n ; i = i + 2)
            System.out.print(i + " ");
        else
            for (i = 1 ; i <= n ; i = i + 2)
                System.out.print(i + " ");


    }

}
