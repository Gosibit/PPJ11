public class Prostokat {
    private double a,b;
    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    protected double getA(){
         return a;
    }

    protected double getB(){
        return b;
    }

    void showPolePowierzchni(){
        System.out.println(a*b);
    }

}
