package entities;

import enums.Dipartimento;

public class Main {
    public static Dipendende[] dipendenti = new Dipendende[3];

    public static void main(String[] args) {
        Dipendende dip1 = new Dipendende(20595142, 1200.00, Dipartimento.VENDITE);
        Dipendende dip2 = new Dipendende(21258943, 1400.00, Dipartimento.AMMINISTRAZIONE);
        Dipendende dip3 = new Dipendende(27896541, 1000.00, Dipartimento.PRODUZIONE);

        dipendenti[0] = dip1;
        dipendenti[1] = dip2;
        dipendenti[2] = dip3;

        System.out.println(dipendenti[0].getMatricola());
        System.out.println(dipendenti[1].getMatricola());
        System.out.println(dipendenti[2].getMatricola());

    }

}