package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;

        //sout ->Tabulator
        System.out.println("Die Sonnen scheint UND es regnet:  " + ergebnis);

        boolean dasBeispielverwirrtmich;
        boolean ichkennemichaus;

        dasBeispielverwirrtmich = false;
        ichkennemichaus = true;

        ergebnis = dasBeispielverwirrtmich || ichkennemichaus;
        System.out.println("Das Beispiel verwirrt mich ODER Ich kenne mich aus: " + ergebnis);

    }
}
