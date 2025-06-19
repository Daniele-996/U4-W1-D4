package entities;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    public Dirigente() {
        super();

    }

    @Override
    public double calculateSalary() {
        double euroOra = 15;
        double oreSettimanali = 40;
        double totStipendio = euroOra * (oreSettimanali * 4);
        return totStipendio;
    }
}
