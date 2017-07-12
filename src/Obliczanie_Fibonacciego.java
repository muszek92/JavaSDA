import java.util.Scanner;

public class Obliczanie_Fibonacciego {

    public static int Fibonacci(int n){  // inicializacja działania i wartosci ( deklaracja ze zmienna jest n)
        int fib0 = 0;
        int fib1 = 1;
        int wynik = 0;

        for (int i = 1; i < n; i++){
            wynik = fib0 + fib1;
            fib0 = fib1;
            fib1 = wynik;
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Podaj n-ty wyraz ciągu: ");
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();       // przypisanie do int n z "Fibonacci"  int-a z "main
       int wynik = Fibonacci(n);        // pobierz wynik zwrócony po wykonaniu funkcji "Fibonacci" i przypisz do zmiennej "wynik"
       System.out.println("Wynik ciągu Fibonacciego to: " + wynik);

    }
}
