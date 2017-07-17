package company;

import java.util.Scanner;

public class Data {


    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcje: ");
        System.out.println("1. Dadaj nowego pracownika");
        System.out.println("2. Usuń pracownika");
        System.out.println("3. Wypisz pracowników");
        System.out.println("0. Wyjdź z programu");
        int option = scanner.nextInt();
        EmployeeManager employeeManager = new EmployeeManager(); // Utworzenie obiektu i nazwanie go employeeManager który zarządza firmą - wciągnięcie klasy EmployeeMagager

        switch (option){
            case 1:{
                employeeManager.addEmployee();
                break;
            }
            case 2:{
                employeeManager.deleteEmployee();
                break;
            }
            case 3:{
                employeeManager.printEmployee();
            }
            case 0:{

            }
        }
    }
}
