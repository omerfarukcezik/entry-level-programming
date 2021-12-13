//klavyeden girilen ve birbirinden farklı üç sayıdan ortancasını
// ekrana yazdıran program
public class _004_findthemiddle {
    public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a, b, c;

    System.out.print("a'yı giriniz :");
    a = kb.nextInt();

    System.out.print("b'yi giriniz :");
    b = kb.nextInt();

    System.out.print("c'yi giriniz :");
    c = kb.nextInt();

    if (a > b)
        if(b > c)
            System.out.print("b :" + b + " ortanca sayıdır");
        else
            if(a > c)
                System.out.print("c :" + c + " ortanca sayıdır");
            else
                System.out.println("a : " + a + " ortanca sayıdır");
    else
        if (a > c)
            System.out.println("a : " + a + " ortanca sayıdır");
        else
            if (b > c)
                System.out.println("c : " + c + " ortanca sayıdır");
            else
                System.out.println("ortanca sayı yoktur");


    }
}
