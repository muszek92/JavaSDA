package abstractExample;


public class Trapez extends Figura {

    int a;
    int b;
    int h;
    int c;
    int d;

    @Override
    public double ObliczPole(){
        System.out.println(" Pole trapezu to: ");
        return ((a+b)/2)*h;
    }

    @Override
    public double ObliczObwod(){
        System.out.println(" Obwód trapezu to: ");
        return a+b+c+d;
    }

}
