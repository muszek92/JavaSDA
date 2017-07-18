package company;
import java.util.Scanner;
public class Data {


    public void start() {

        boolean exit =false;
        EmployeeManager employeeManager = new EmployeeManager(); // Utworzenie obiektu i nazwanie go employeeManager który zarządza firmą - wciągnięcie klasy EmployeeMagager

        while (exit == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Dadaj nowego pracownika");
            System.out.println("2. Usuń pracownika");
            System.out.println("3. Wypisz pracowników");
            System.out.println("4. Policz średnią pensje pracowników");
            System.out.println("5. Policz średni wiek");
            System.out.println("0. Wyjdź z programu");
            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    employeeManager.addEmployee();
                    break;
                }
                case 2: {
                    employeeManager.deleteEmployee();
                    break;
                }
                case 3: {
                    employeeManager.printEmployees();
                    break;
                }
                case 4: {
                     employeeManager.avgEmployeesSalary();
                }
                case 5: {
                    employeeManager.avgEmployeesAge();
                }
                case 6: {
                    employeeManager.maxEmployeesSalary();
                }

                case 0: {
                    exit = true;
                    break;

                }
                default:{
                    System.out.println("Nie ma takiej opcji");
                    break;
                }
            }
        }
    }
}

// Obiekty i klasy:
// Klasa definiuje metody(konstruktory) i pola
// Konstruktor wywołujemy poprzez użycie new

//Hermetyzacja  - zamkniecie zmienniej w danej klasie, nie jest ogolno dostępna tylko poprzez wywołanie metod get / set1