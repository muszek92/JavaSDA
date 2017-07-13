package zadanie_1_oop;


public class Point {

    public int x;
    public int y;


   public double distanceFromOrigin(){
    double odleglosc = Math.sqrt(x*x+y*y);
    return odleglosc;
   }



}
