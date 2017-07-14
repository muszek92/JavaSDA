package zadanie_2_oop;


public class Circle {
    int radius = 0;

    public double Area(){
        double areaScore =  2*Math.PI*radius;
        return areaScore;
    }

    public double Circumference(){
        double ferenceScore = Math.PI * (radius*radius);
        return ferenceScore;
    }
}
