public class _025_findingvalue {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int y, k, x, t;

        System.out.print("x'i giriniz :");
        x = kb.nextInt();

        y = k * x + t;

        if (x < 0) {
            k = 2;
            t = 0;

        }
        else
            if (x <= 5) {
                k = 3;
                t = -20 ;

            }
            y = k * x + t;
            System.out.println("y :" + y);
    }
}
