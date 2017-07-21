package inheritance.zadanie_7;


public class Punkt3D extends Punkt2D {

    private double z ;

    public Punkt3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void opiszPunkt() {
        System.out.println("Moje współrzędne to: " + "\nZ: " + getY() + "\nX: "+ getX() + "\nZ: " + getZ());
    }
}
