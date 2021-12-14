//klavyeden girilen a ve b sayılarının arasında ki sayıları yazdıran program
public class _033_forexample {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int a, b, i;

        System.out.print("a'yı giriniz : ");
        a = kb.nextInt();

        System.out.print("b'yi giriniz : ");
        b = kb.nextInt();

        for (i = a ; i <= b ; i = i + 1)
            System.out.print(i + " ");
    }
}
