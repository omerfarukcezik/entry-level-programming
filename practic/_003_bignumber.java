// Klavyeden girilence birbirinden farklı üç sayının en büyüğünü yazdıran program
public class _003_bignumber {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;

        System.out.print("a'yı giriniz :");
        a = kb.nextInt();
        System.out.print("b'yi giriniz : ");
        b = kb.nextInt();
        System.out.print("c'yi giriniz : ");
        c = kb.nextInt();

        if (a > b)
            if(a > c)
                System.out.println("a : " + a + " en büyüktür");
                else
                        System.out.println("c :" + c + " en büyüktür");
        else
            if (b > c)
                System.out.println("b : " + b + " en büyüktür");
            else
                System.out.println("c :" + c + " en büyüktür");

    }
}
