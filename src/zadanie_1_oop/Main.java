package zadanie_1_oop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Point point_1 = new Point();
        Point point_2 = new Point();

        System.out.println("Podaj  współrzędną X pierwszego punktu: ");
        point_1.x = scanner.nextInt();
        System.out.println("Podaj  współrzędną Y pierwszego punktu: ");
        point_1.y = scanner.nextInt();

        System.out.println();
        System.out.println("Podano poprawne dane\n");

        System.out.println("Podaj  współrzędną X drugiego punktu: ");
        point_2.x = scanner.nextInt();
        System.out.println("Podaj  współrzędną Y drugiego punktu: ");
        point_2.y = scanner.nextInt();
        System.out.println("Podano poprawne dane\n");
        System.out.println();

        System.out.println("------ Wyniki ------");

        System.out.println("Odległosc od pierwszego punktu:" + point_1.distanceFromOrigin() + "\nOdległośc od drugiego punktu: " + point_2.distanceFromOrigin());
    }
}
