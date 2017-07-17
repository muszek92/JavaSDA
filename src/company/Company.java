package company;

public class Company {

    private String name;
    private Employee [] employees;  // deklaracja tablicy typu własnego - tablicy - każdy element będzie typu pracownik
    private int numberOfEmployees;  // tablica Pracowników zawiera pracwonikówk

    public Company(){
        employees = new Employee[10]; // Nasza klasa bedzie zawierała 10 pracowników
        numberOfEmployees = 0;
    }

    //metoda do wpisywania pracowników
    public void printEmployees(){
        for (Employee e : employees){  // każdego pojedynczeo pracownika z tablicy Employee nazwij e / przypisz do e
            e.describeEmpolyee();
        }
    }

    // metoda do dodawania pracowników do tablicy pracowników
    public void assignEmpolyeeToArray(Employee nextEmployee){
        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;
    }

    // metoda do wypisywania pracowników
}
