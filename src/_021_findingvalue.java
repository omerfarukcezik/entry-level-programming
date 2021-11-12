public class _021_findingvalue {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int x, y, z;

        System.out.println("X'i giriniz:");
        x = kb.nextInt();

        if (x <0) {
            y = x * x + 2 * x;
            z = 3 * x;

            System.out.println("Değeri Y:" + y);
            System.out.println("Değeri Z:" + z);
        }
        else{
            y = x;
            z = x * x + 10;
            System.out.println("Değeri Y:" + y);
            System.out.println("Değeri Z:" + z);
        }
    }
}
