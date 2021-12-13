//İkizkenar üçgen mi?
//Üçgen olduğunu kabul edeceğiz ve eşkenar üçgen ikizkenar kabul edilmeyecek!
//yani iki kenar birbirine eşit olacak ve bunlar üçüncü kenardan farklı olacak...
public class _002_findingisosceles {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;

        System.out.print("a kenarını giriniz :");
        a = kb.nextInt();
        System.out.print("b kenarını giriniz :");
        b = kb.nextInt();
        System.out.print("c kenarını giriniz :");
        c = kb.nextInt();

        if (a == b)
            if(a != c)
                System.out.println("İkizkenardır");
            else
                System.out.println("Eşkenardır");
        else
            if (a == c)
                System.out.println("İKizkenardır");
            else
                if (b == c)
                    System.out.println("İkizkenardır");
                else
                    System.out.println("Kenarlar eşit değildir");


    }
}
