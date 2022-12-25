public class Prostopadloscian extends Prostokat {
    protected double h;

    Prostopadloscian(double a, double b, double h){
        super(a,b);
        this.h = h;
    }

    Prostopadloscian(Prostokat prostokat, double h){
        super(prostokat.getA(), prostokat.getB());
        this.h = h;
    }

    void showPolePowierzchni(){
        double a = super.getA();
        double b = super.getB();

        System.out.println(2*(a*b + a*h + b*h));
    }

    void showObjetosc() {
        System.out.println(super.getA() * super.getB() * h);
    }
}
