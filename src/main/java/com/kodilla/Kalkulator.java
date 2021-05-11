package com.kodilla;

public class Kalkulator {

    public void dodawanie(double a, double b) {
        double suma;
        suma = a+b;
        System.out.println("Wynikiem dodawania liczby a "+a+" i b "+b+" jest "+suma);

    }
    public void odejmowanie(double a,double b ) {


        double roznica;
        roznica=a-b;
        System.out.println("Wynikiem odejmowania liczby a " +a+" i b "+b+" jest "+roznica);

       }

    public static void main(String args[]) {
       Kalkulator kalkulator = new Kalkulator();
        kalkulator.dodawanie(4,3);
        kalkulator.odejmowanie(6,1);
    }


}
