package zadanie_2_oop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle maleKolo = new Circle();

        System.out.println("---- Program obliczający pole oraz obwód koła ----");
        System.out.println();

        System.out.println("Podaj promień: ");
        maleKolo.radius = scanner.nextInt();

        System.out.println("Pole koła wynosi: " + maleKolo.Area() + "\nObwód koła wynosi: " + maleKolo.Circumference());


    }
}
