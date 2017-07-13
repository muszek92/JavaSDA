package Programowanie_obiektowe_1;


public class Pracownik {

    // deklaracja / utworzenie pola w klasie
    public String imie;   //pole - pojedynczy element
    public String nazwisko;
    public int wiek;
    public float pensja;

    // metoda klasy Pracownik
    public void opis(){
        System.out.println("Pracownik");
    }

    public void OpiszPracownika(){
        System.out.println("Imię: " + imie + " Nazwisko: " + nazwisko);
    }


}
