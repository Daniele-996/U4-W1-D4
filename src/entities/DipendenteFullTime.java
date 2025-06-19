package entities;

import enums.Dipartimento;

public abstract class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        double euroOra = 7.5;
        double oreSettimanali = 40;
        double totStipendio;
        return totStipendio = euroOra * (oreSettimanali * 4);
    }
}
