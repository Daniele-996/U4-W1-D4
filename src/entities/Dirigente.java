package entities;

import enums.Dipartimento;

public abstract class Dirigente extends Dipendente {

    public Dirigente(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        double euroOra = 15;
        double oreSettimanali = 40;
        double totStipendio;
        return totStipendio = euroOra * (oreSettimanali * 4);

    }
}

