package entities;

import interfaces.Orario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Volontario implements Orario {
    private String name;
    private int eta;
    private String CV;

    public Volontario(String name, int eta, String CV) {
        this.name = name;
        this.eta = eta;
        this.CV = CV;
    }

    public String getName() {
        return name;
    }

    public int getEta() {
        return eta;
    }

    public String getCV() {
        return CV;
    }

    @Override
    public void checkIn(LocalDateTime time) {
        System.out.println("Sono un " + this.getClass().getSimpleName() + " e ho timbrato alle " + time.format(DateTimeFormatter.ISO_TIME));
    }
}
