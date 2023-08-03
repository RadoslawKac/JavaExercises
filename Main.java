package com.company;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Silnia sil = new Silnia(4);
        sil.IleWynosiSilnia();
        System.out.println("--------------------------------------------");

        Trojkat tr = new Trojkat(4,3,5);
        Trojkat tr2 = new Trojkat(4,8,6);
        tr.CzyTrojkat();
        tr2.CzyTrojkat();
        System.out.println("--------------------------------------------");


        Wiek w1=new Wiek(1996);
        w1.WiekMethod();
        System.out.println();
        System.out.println("--------------------------------------------");


        Czlowiek c1 = new Czlowiek("Radek", "Kaczmarski", LocalDate.of(1962,8,26),"98082604474");
        c1.sumaKontrolna();
        System.out.println(c1.plecPesel());
        System.out.println("--------------------------------------------");

        Czlowiek c2 = new Czlowiek("Magda","Kowalska",LocalDate.of(1992,4,12),"92041275539");
        c2.sumaKontrolna();
        System.out.println(c2.plecPesel());
        System.out.println("--------------------------------------------");

        Czlowiek c3 = new Czlowiek("Marcin","Nowak",LocalDate.of(1978,7,18),"78071842995");
        c3.sumaKontrolna();
        System.out.println(c3.plecPesel());
        System.out.println("--------------------------------------------");

        Czlowiek c4 = new Czlowiek("Olga","Soboń",LocalDate.of(1996,11,23),"99112371542");
        c4.sumaKontrolna();
        System.out.println(c4.plecPesel());
        System.out.println("--------------------------------------------");

        Czlowiek c5 = new Czlowiek("Artur","Paskal",LocalDate.of(1988,2,25),"88022568751");
        c5.sumaKontrolna();
        System.out.println(c5.plecPesel());
        System.out.println("--------------------------------------------");
    }
}


