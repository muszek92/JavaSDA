package abstractExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean czyWyjsc = false;

        Figura[] tablicaFigur = new Figura[10];
        int liczbaFigur = 0;

        System.out.println("----------Obliczanie pola i obwodu-------------");


        while (czyWyjsc == false) {

            System.out.println("1. Dodaj nowy kwadrat\n2. Dodaj nowy prostokąt\n3. Oblicz pola wszystkich");
            int wybor = scanner.nextInt();
            Figura f = null;

            switch (wybor) {
                case 1:
                    System.out.println("Aby obliczyć pole i obwód kwadratu - podaj długość boku a:");
                    int bok = scanner.nextInt();
                    f = new Kwadrat(bok);
                    tablicaFigur[liczbaFigur] = f;
                    liczbaFigur++;
                    break;
                case 2:
                    System.out.println("Aby obliczyć pole i obwód prostokata - podaj długość boku a:");
                    int bokPierwszy = scanner.nextInt();
                    int bokDrugi = scanner.nextInt();
                    f = new Prostokat(bokPierwszy, bokDrugi);
                    tablicaFigur[liczbaFigur] = f;
                    liczbaFigur++;
                    break;
                case 3:
                    System.out.println("Pola figur to");
                    for (int i = 0; i < liczbaFigur; i++) {
                        Figura figuraZTablicy = tablicaFigur[i];
                        double pole = figuraZTablicy.ObliczPole();
                        System.out.println("Pole to: " + pole);
                    }
                case 0:
                    System.out.println("Wychodzę z programu");
                    czyWyjsc = true;
            }


        }

    }


}
