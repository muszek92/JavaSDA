package zadanie_2_oop;


public class Circle {

    //pola, konstruktory, metody

    private double radius = 0;  // inicjalizujemy  zmienną radius jako private (hermetyzacja, vadilacja)

    public double getRadius(){  // Metoda pobierająca wartość pola radius
        return this.radius;
    }

    public void setRadius (double r){  // Metoda ustawiająca wartośc pola radius, metoda sprawdza czy promien jest większy od zera
        if (r < 0){
            System.out.println("Promien nie może być ujemny");
        } else {
            this.radius = r;
        }
    }


    public double Area(){
        double areaScore =  2*Math.PI*radius;
        return areaScore;
    }

    public double Circumference(){
        double ferenceScore = Math.PI * (radius*radius);
        return ferenceScore;
    }
}
