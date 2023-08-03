package com.company;

import java.time.Instant;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wiek {
    int rokUrodzenia;

    public Wiek(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public void WiekMethod (){
        int aktualnyWiek = YearMonth.now().getYear() - rokUrodzenia;
        if (aktualnyWiek % 2 ==0) {
            System.out.println("Aktualny wiek: "+aktualnyWiek + " wiek ten jest liczbą parzystą");
            boolean[] pierwsze = new boolean[aktualnyWiek];
            Arrays.fill(pierwsze, true);
            pierwsze[0] = false;
            pierwsze[1] = false;
            for (int i = 2; i <= Math.sqrt(aktualnyWiek); i++)
            {
                for (int t = i + i; t < aktualnyWiek; t = t + i) {
                    pierwsze[t] = false;
                }
            }
            System.out.println("Liczby pierwsze z zakresu <1,"+aktualnyWiek +">");
            for (int r = 0; r < aktualnyWiek; r++) {
                if (pierwsze[r])
                    System.out.print(r+" ");
            }
        }
        if (aktualnyWiek % 2 != 0){
            System.out.println("Aktualny wiek: "+aktualnyWiek + " wiek ten jest liczbą nieparzystą");
            List<Integer> nieparzyste = new ArrayList<Integer>();
            for (int i=1;i<aktualnyWiek-1;i++){
                if(i%2 != 0){
                    nieparzyste.add(i);
                }
            }
            int sum=0;
            for (int liczba: nieparzyste){
                sum += liczba;
            }
            System.out.print("Suma liczb nieparzystych to: "+sum );
        }
    }
}
