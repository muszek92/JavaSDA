package overloading;


public class Author {

    private String name;
    private String surename;
    private int age;

    public Author(int age) {
        this.age = age;
    }

    public Author(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    public Author(String name, String surename, int age) {
        this.name = name;
        this.surename = surename;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
