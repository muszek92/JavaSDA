package inheritance.zadanie_7;


public class Punkt2D {

    private double x;
    private double y ;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public  Punkt2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void opiszPunkt() {
        System.out.println("Moje współrzędne to: " + getY() + getX());

    }

}

