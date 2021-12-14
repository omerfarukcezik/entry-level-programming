//n klavyeden girilen pozitif bir sayıdır 1'den n ye kadar olan sayıları
//ekrana yazdıran program
public class _032_printnumber4 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, i;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for(i = 1 ; i <= n ; i = i + 1)
            System.out.print(i + " ");
    }
}