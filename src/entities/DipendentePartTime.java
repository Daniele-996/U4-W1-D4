package entities;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        double euroOra = 15;
        double oreSettimanali = 20;
        double totStipendio = euroOra * (oreSettimanali * 4);
        return totStipendio;
    }
}
