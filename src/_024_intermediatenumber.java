public class _024_intermediatenumber {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        if (n > 0)
            if (n < 100)
                System.out.println("Arasında");
            else
                System.out.println("Arasında değil");
    }
}
