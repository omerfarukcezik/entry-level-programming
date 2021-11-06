public class _005_CircleArea {
    public static void main(String[] args) {
        java.util.Scanner kb =new java.util.Scanner(System.in);
        double r, pi, area;
        System.out.println("Radyanı giriniz : ");
        r = kb.nextDouble();
        pi = 3.12159;
        area = pi * r * r;
        System.out.println("Dairenin alanı : " +area);


    }
}
