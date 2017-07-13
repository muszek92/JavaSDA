package Programowanie_obiektowe_1;

public class Main {
    public static void main(String[] args) {

        Pracownik prezes = new Pracownik();
        Pracownik dyrektor = new Pracownik();

        prezes.imie = "Piotr";
        prezes.nazwisko = "Mucha";
        prezes.wiek = 35;
        prezes.pensja =17000;


        dyrektor.imie = "Kazimierz";
        dyrektor.nazwisko = "Głuchy";
        dyrektor.wiek = 25;
        dyrektor.pensja =15000;

        prezes.OpiszPracownika();

    }

}
