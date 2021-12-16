// klavyeden girilen 5 sayının toplamını ekrana yazdıran program
public class _039_forexample6 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i , n , sum;

        sum = 0;

        for (i = 1 ; i < 6 ; i = i + 1)
        {
            System.out.print(i + ".sayıyı giriniz :");
        n = kb.nextInt();
        sum = sum + n; }
        System.out.print("Sayıların toplamı : " + sum);

    }
}
