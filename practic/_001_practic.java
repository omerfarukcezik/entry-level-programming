public class _001_practic {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        if (n < 10)
            System.out.println("1 basamaklı");
        else
        if (n < 100)
            System.out.println("2 basamaklı");
        else
            System.out.println("3 basamaklı");

    }
}
