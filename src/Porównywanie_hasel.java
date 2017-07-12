import java.util.Scanner;

public class Porównywanie_hasel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haslo = sc.next();
        String ponownieHaslo = sc.next();

        if (haslo.equals(ponownieHaslo)) {
            System.out.println("Hasło poprawne");
        } else {
            System.out.println("Haslo błędne");
        }

    }
}
