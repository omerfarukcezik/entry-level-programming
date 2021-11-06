import java.sql.SQLOutput;

public class _003_AdditionProgram {
    public static void main (String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int height, width, area;

        //Yukseklik ve genişlik giriliyor
        System.out.print ("Yüksekliği giriniz : ");
        height = kb.nextInt ();

        System.out.print ("Genişliği giriniz : ");
        width = kb.nextInt ();

        area = height * width ;
        System.out.println("Dikdörtgenin alanı = " + area);

    }
}
