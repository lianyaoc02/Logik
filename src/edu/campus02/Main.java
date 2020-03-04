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
        System.out.println("Bin ich verwirrt ODER kenne ich mich aus: " + ergebnis);

        //Bsp3: (1 > 3 UND (NICHT (3-1 < 5)) ODER 2 == 4 * 4
        //      (1 > 3 && ! (3 -1 < 5)) || 2 == 4 * 4

        boolean teil1;
        boolean teil2;
        boolean ergebnis3;

        teil1 = 1 > 3 && !(3 - 1 < 5);
        teil2 = 2 == 4;

        ergebnis3 = teil1 || teil2;

        System.out.println("Ergebnis 3: " + ergebnis3);

        //Bsp4: (6 >= 2 * 3 || 2 - 3 < 0) && (1*1 == 1 && 1 !=1 + 1)

        boolean ergebnis4;
        ergebnis4 = (6 >= 2 * 3 || 2 - 3 < 0) && (1*1 == 1 && 1 !=1 + 1);

        System.out.println("Ergebnis 4: " + ergebnis4);

    }
}
