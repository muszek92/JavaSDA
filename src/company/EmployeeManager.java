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
       int index = scanner.nextInt();
       myCompany.deleteEmployee(index);
    }

    // metoda do wypisywania listy pracowników
    public void printEmployees(){
        myCompany.printEmployees();
    }

    // metoda do wypisywania średniej pensji
   public void avgEmployeesSalary(){
       double result = myCompany.countAverageSalary();
       System.out.println("średnia pensji to: " + result);

   }

   // metoda do wypisywania średniego wieku
    public void avgEmployeesAge(){
       double result = myCompany.countAverageAge();
       System.out.println("średni wiek pracowników to: " + result);
    }

    // metoda do wypisywania największej pensji

    public void maxEmployeesSalary(){
        Employee result = myCompany.EmployeeWithHightSalary();
        System.out.println("Pracownik z najwyższą pensją to: " + result.getName() + " " + result.getSurname() + " i jego pensja wynosi: " + result.getSalary()) ;
    }

}
