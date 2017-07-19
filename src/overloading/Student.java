package overloading;


public class Student {

    private String name;
    private String surname;
    private int age;
    private int indexNumber;
    private int yearOfStudy;

    //Konstruktor bezparametrowy
    public Student(){

    }

    public Student(int age){
        this.age = age;
    }

    public Student (String name, String surname){
        this.name = name;
        this.surname = surname;}

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

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
