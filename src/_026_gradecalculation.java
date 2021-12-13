//Klavyeden giriken puan notunu harf notu olarak ekrana yazdıran program
// sayılara 0 ile 100 arasında girildiği kabul edilecektir
public class _026_gradecalculation {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, A, B, C, D;

        System.out.print("Puan notunu giriniz :");
        n = kb.nextInt();

        if (20 >= n)
            System.out.println("E");
        else
            if (40 >= n)
                System.out.println("D");
            else
                if (60 >= n)
                    System.out.println("C");
                else
                    if(80 >= n)
                        System.out.println("B");
                    else
                        if(100 >= n)
                            System.out.println("A");
    }
}
