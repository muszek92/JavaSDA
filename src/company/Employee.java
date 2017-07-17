package company;


public class Employee {

        private  String name;
        private String surname;
        private int age;
        private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ){
            System.out.println("Wiek nie moze byc mniejszy od 0");
        }else
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.out.println("Wypłatna nie może być ujemna");
        }else
        this.salary = salary;
    }

    public void describeEmpolyee(){
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Age: " + this.age);
    }
}
