package entities;

import enums.Dipartimento;

public abstract class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        double euroOra = 7.5;
        double oreSettimanali = 20;
        double totStipendio;
        return totStipendio = euroOra * (oreSettimanali * 4);

    }
}
