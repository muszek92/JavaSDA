package Programowanie_obiektowe_1;


public class Pracownik {

    // Pola -> Konstruktory -> Metody

    // deklaracja / utworzenie pola w klasie
    public String imie;   //pole - pojedynczy element
    public String nazwisko;
    public int wiek;
    public float pensja;

    public Pracownik(){         // defaultowo puste - jest to konstruktor odpowiadacjący i pobierany do "new" np. Pracownik dyrektor = new Pracownik();
        pensja = 2000;       // zwykła metoda która pozwala na starcie ziinicjować / przypisać odrazu jakąś wartość na STARCIE
    }

    // metoda klasy Pracownik
    public void opis(){
        System.out.println("Pracownik");
    }


    public void OpiszPracownika(){
        System.out.println("Imię: " + imie + " Nazwisko: " + nazwisko );  // this - odniesienie do tego który wywołał tą metodę
    }


}
