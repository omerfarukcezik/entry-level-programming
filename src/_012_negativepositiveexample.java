public class _012_negativepositiveexample {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int n;

        System.out.print("Bir sayı giriniz : ");
        n = kb.nextInt();

        if(n<0)
        System.out.println("Negatif");
        else
        System.out.println("Pozitif");



    }
}
