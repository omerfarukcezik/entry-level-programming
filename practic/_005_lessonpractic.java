public class _005_lessonpractic {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n, sum;

        System.out.print("n yi giriniz : ");
        n = kb.nextInt();

        sum = 0;

        for (i =1; i <= n; i = i + 1 ) {
            sum = sum + i;
            System.out.println("Toplam : " + sum);
        }

    }
}
