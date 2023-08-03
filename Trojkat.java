package com.company;

public class Trojkat {
    public double a;
    public double b;
    public double c;

    public Trojkat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void CzyTrojkat(){
        if (this.a + this.b > this.c & this.b + this.c > this.a & this.a + this.c > this.b){
            System.out.println("Można zbudować trójkąt");
        }
        else {
            System.out.println("Nie można zbudować trójkąta");
        }

        if (this.a*this.a + this.b*this.b == this.c*this.c){
            System.out.println("Trójkąt prostokątny");
        }

        if (this.a*this.a + this.b*this.b < this.c*this.c){
            System.out.println("Trójkąt rozwartokątny");
        }

        if (this.a*this.a + this.b*this.b > this.c*this.c){
            System.out.println("Trójkąt ostrokątny");
        }
    }
}
