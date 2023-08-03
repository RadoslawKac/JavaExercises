package com.company;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Czlowiek {
    public static String imie;
    public static String nazwisko;
    public static LocalDate dataUrodzenia;
    public static String pesel;

    public Czlowiek(){
    }

    public Czlowiek(String imie, String nazwisko,LocalDate dataUrodzenia, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia=dataUrodzenia;
        this.pesel = pesel;
    }


    static void sumaKontrolna() {
        List<Integer> liczby = new ArrayList<Integer>();
        for(int i=0;i<pesel.length();i++){
            int liczba = Character.getNumericValue(pesel.charAt(i));
            liczby.add(liczba);
        }

        int check = 1 * liczby.get(0) + 3 * liczby.get(1) + 7 * liczby.get(2) + 9 * liczby.get(3)
                + 1 * liczby.get(4) + 3 * liczby.get(5) + 7 * liczby.get(6) + 9 * liczby.get(7)
                + 1 * liczby.get(8) + 3 * liczby.get(9);
        int lastNumber = check % 10;
        int controlNumber = 10 - lastNumber;

        if (controlNumber == liczby.get(10)) {
            System.out.println("Pesel jest prawidłowy");
            System.out.println(wiekEmerytalny());
        }

        else {
            System.out.println("Podałeś błędny numer Pesel");
        }

    }

    static String plecPesel() {
        int liczbaPlec = Character.getNumericValue(pesel.charAt(9));
        if(liczbaPlec%2==0 & imie.charAt(imie.length() - 1)=='a'){
            return "Płeć sie zgadza";
        }
        else if (liczbaPlec%2!=0 & imie.charAt(imie.length() - 1)!='a'){
            return "Płeć sie zgadza";
        }
        else {
            return "Płeć sie nie zgadza";
        }
    }

    static String wiekEmerytalny(){
        if(imie.charAt(imie.length() - 1)=='a' & YearMonth.now().getYear()-dataUrodzenia.getYear()>=60){
            return "Osiągnięty wiek emerytalny u kobiety";
        }
        else if (imie.charAt(imie.length() - 1)!='a' & YearMonth.now().getYear()-dataUrodzenia.getYear()>=65){
            return "Osiągnięty wiek emerytalny u mężczyzny";
        }
        else{
            return "Brak osiągniętego wieku emerytalengo";
        }
    }
}









