//n klavyeden girilen pozitif bir sayıdır 1 den n ye kadar olan sayıların toplamını ekrana yazdıran program
public class _038_forexample5 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n , i ,sum;

        System.out.print("n yi giriniz ;");
        n = kb.nextInt();

        sum = 0;

        for (i = 1 ; i <= 10 ; i = i + 1) {

            sum = sum + i;

            System.out.print(" Toplam = " + sum);

        }

    }
}
