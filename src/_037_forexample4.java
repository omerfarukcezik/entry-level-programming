//1 ile 100 arasında ki 3 ün 4 ün ve 5 in katlarını yazdıran program
public class _037_forexample4 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i;

        for (i = 1 ; i <= 100 ; i = i + 1)
        {
            if (i % 3 == 0)
                System.out.print(" " + i);
            if (i % 4 == 0)
                System.out.print(" " + i);
            if (i % 5 == 0)
                System.out.print(" " + i);
        }

    }
}
