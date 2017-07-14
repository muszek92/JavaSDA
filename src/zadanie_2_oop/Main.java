package zadanie_2_oop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle maleKolo = new Circle();

        System.out.println("---- Program obliczający pole oraz obwód koła ----");
        System.out.println();

        System.out.println("Podaj promień: ");
        maleKolo.setRadius(scanner.nextInt()); // Dosłownie Przypisz  za pomocą metody setRadius promień (z vadilacja)

        System.out.println("Pole koła wynosi: " + maleKolo.Area() + "\nObwód koła wynosi: " + maleKolo.Circumference() + "\nPromnień wynosi: " + maleKolo.getRadius());


    }
}
