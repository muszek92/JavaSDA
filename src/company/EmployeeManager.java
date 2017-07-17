package company;


import java.util.Scanner;

public class EmployeeManager {

    private Company myCompany;
    private Scanner scanner;

    public EmployeeManager() {
        this.myCompany = new Company(); // obiekt myCompany dodający nowy rekord do Company - do firmy
        scanner = new Scanner(System.in);
    }

    // metoda wpisywania danych pracownika i przekazywania ich do tablicy
    public void addEmployee(){

        Employee nextEmp = new Employee();

        System.out.println("Podaj imię:");
        nextEmp.setName(scanner.next());

        System.out.println("Podaj nazwisko:");
        nextEmp.setSurname(scanner.next());

        System.out.println("Podaj wiek: ");
        nextEmp.setAge(scanner.nextInt());

        System.out.println("Podaj pensje: ");
        nextEmp.setSalary(scanner.nextDouble());

        myCompany.assignEmpolyeeToArray(nextEmp);
    }

    // metoda do usuwania pracownika z bazy
    public void deleteEmployee(){

        System.out.println("Podaj id pracownika którego chcesz usunąć: ");
        Employee delEmp = null;
        delEmp.getName(scanner.nextInt());
    }

    // metoda do wypisywania listy pracowników
    public void printEmployees(){

    }

}
