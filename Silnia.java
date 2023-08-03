package com.company;

public class Silnia {
    public int n;

    public Silnia(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void IleWynosiSilnia(){
        int silnia = 1;

        for (int i = 1; i <= this.n; i++){
            silnia = silnia * i;
        }
        System.out.println("Silnia wynosi "+ silnia);
    }
}
