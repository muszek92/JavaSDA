package zadanie_1_oop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Point point_1 = new Point();
        Point point_2 = new Point();

        System.out.println("Podaj pierwszą współrzędną pierwszego punktu: ");
        point_1.x = scanner.nextInt();
        System.out.println("Podaj drugą współrzędną pierwszego punktu: ");
        point_1.y = scanner.nextInt();

        point_2.x = 2;
        point_2.y = 17;


        System.out.println("Odległosc od pierwszego punktu:" + point_1.distanceFromOrigin() + "\nOdległośc od drugiego punktu: " + point_2.distanceFromOrigin());
    }
}
