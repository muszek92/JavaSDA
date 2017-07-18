package company;

public class Company {

    private String name;
    private Employee[] employees;  // deklaracja tablicy typu własnego - tablicy - każdy element będzie typu pracownik
    private int numberOfEmployees;  // tablica Pracowników zawiera pracwonikówk

    public Company() {
        employees = new Employee[10]; // Nasza klasa bedzie zawierała 10 pracowników
        numberOfEmployees = 0;
    }


    // metoda do dodawania pracowników do tablicy pracowników
    public void assignEmpolyeeToArray(Employee nextEmployee) {
        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;
    }

    //metoda do wypisywania pracowników każdego pojedynczeo pracownika z tablicy Employee nazwij e / przypisz do e
    public void printEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee emp = employees[i]; // pobierz i przypisz do emp i-tego pracownika i wywołaj metodę opisz pracownika
            emp.describeEmpolyee();
        }
        if (numberOfEmployees < 1) {
            System.out.println("Nie ma pracowników w bazie, nie można nikogo wyświetlić");
        } else {
        }
    }

    public void deleteEmployee(int index) {
        //usuwanie z tablicy
        employees[index] = null;

    }

    // metoda licząca srednia pensje pracownikow
    public double countAverageSalary() {

        double sum = 0;

        for (int i = 0; i < numberOfEmployees; i++) {
            Employee emp = employees[i];
            sum += emp.getSalary();
        }
       double countAverage = sum/numberOfEmployees;
       return countAverage;

    }

    // metoda licząca srednia wieku pracownikow
    public double countAverageAge() {

        double sum = 0;

        for (int i = 0; i < numberOfEmployees; i++) {
            Employee emp = employees[i];
            sum += emp.getAge();
        }
        double countAverageAge = sum/numberOfEmployees;
        return countAverageAge;
    }


    //metoda szukajaca pracownika z największą wypłatą
    public Employee EmployeeWithHightSalary(){

        double Salary = 0;
        Employee maxEmp= null;

        for (int i = 0; i < numberOfEmployees; i++){
           Employee nextSalary = employees[i];

            if (nextSalary.getSalary() > Salary){
                Salary = nextSalary.getSalary();
                maxEmp = employees[i];
            }

        }
        return maxEmp;
    }
}
