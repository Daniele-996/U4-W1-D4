package entities;

import enums.Dipartimento;

import java.util.Arrays;

public class Main {
    public static Dipendente[] dipendenti = new Dipendente[3];

    public static void main(String[] args) {
        // Dipendente dip1 = new Dipendente(20595142, 1200.00, Dipartimento.VENDITE);
        // Dipendente dip2 = new Dipendente(21258943, 1400.00, Dipartimento.AMMINISTRAZIONE);
        // Dipendente dip3 = new Dipendente(27896541, 1000.00, Dipartimento.PRODUZIONE);

        // dipendenti[0] = dip1;
        // dipendenti[1] = dip2;
        // dipendenti[2] = dip3;

        // System.out.println(dipendenti[0].getMatricola());
        // System.out.println(dipendenti[1].getMatricola());
        // System.out.println(dipendenti[2].getMatricola());

        DipendenteFullTime dipFull = new DipendenteFullTime(24512521, Dipartimento.VENDITE) {
            @Override
            public void checkIn() {

            }
        };
        DipendentePartTime dipPart = new DipendentePartTime(25414817, Dipartimento.PRODUZIONE) {
            @Override
            public void checkIn() {

            }
        };
        Dirigente dipDiri = new Dirigente(12551452, Dipartimento.AMMINISTRAZIONE) {
            @Override
            public void checkIn() {

            }
        };

        // System.out.println(dipFull.calculateSalary());
        // System.out.println(dipPart.calculateSalary());
        // System.out.println(dipDiri.calculateSalary());

        Dipendente[] dipendeti = {dipFull, dipPart, dipDiri};

        int sommaStipendi = 0;
        for (int i = 0; i < dipendeti.length; i++) {
            sommaStipendi += dipendeti[i].calculateSalary();
            System.out.println(sommaStipendi);
        }

        Volontario volOne = new Volontario("Daniele", 29, "curricilum") {
            @Override
            public void checkIn() {

            }
        };
        Volontario volTwo = new Volontario("Alessio", 32, "digitale") {
            @Override
            public void checkIn() {

            }
        };
        Volontario volThree = new Volontario("Gianmarco", 31, "curricilum digitale") {
            @Override
            public void checkIn() {

            }
        };

        for (Volontario volontario : Arrays.asList(volOne, volTwo, volThree)) {
            System.out.println(volontario.checkIn());
        }

    }

}