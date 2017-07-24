package abstractExample;
public class Kwadrat extends Figura {

    private double a;

    public Kwadrat (){

    }

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA(){
        return a;
    }

    public void setA(double a){
      this. a= a;
}

    @Override
    public double ObliczPole() {
        System.out.println("POLE KWADRATU");
        return a*a;
    }

    @Override
    public double ObliczObwod() {
        return 4*a;
    }
}