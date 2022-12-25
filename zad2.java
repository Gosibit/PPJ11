public class zad2 {
    public static void main(String[] args) {
        Prostokat p0 = new Prostokat(1,2);

        Prostopadloscian p1 = new Prostopadloscian(1,2,3);

        Prostopadloscian p2 = new Prostopadloscian(p0,3);

        p2.h = 4;

        p1.showPolePowierzchni();
        p1.showObjetosc();
        p2.showPolePowierzchni();
        p2.showObjetosc();

    }
}
