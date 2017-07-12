import java.util.Scanner;

public class Program_zamiana_temperatury_Ca_na_Fa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------ Program do zamiany stopni C na Fa ------------");
        System.out.println(" ----------- Wybierz interesujące Cię działanie -----------");
        System.out.println("1. Zamiana C na Fa \n2. Zamiana Fa na C");

        int i = scanner.nextInt();

        switch (i) {
            case 1:
                float wynikFa = 0;
                System.out.println("Podaj temperature w Celsiuszach: ");
                float c = scanner.nextInt();
                wynikFa = c * 9 / 5 + 32;

                System.out.println("Wynik:" + wynikFa);
                break;
            case 2:
                float wynikC = 0;
                System.out.println("Podaj temperature w Fareinheitach: ");
                float fa = scanner.nextInt();
                wynikC = (fa - 32) / (float) 1.8;
                System.out.println("Wynik:" + wynikC);
                break;
        }

    }
}
