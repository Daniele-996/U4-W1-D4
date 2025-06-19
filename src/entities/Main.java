package entities;

import enums.Dipartimento;

public class Main {
    public static void main(String[] args) {
        Dipendende dip1 = new Dipendende(20595142, 1200.00, Dipartimento.VENDITE);
        System.out.println(dip1.getMatricola());
        System.out.println(dip1.getStipendio());
        System.out.println(dip1.getDipartimento());
    }
}