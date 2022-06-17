package TP17Juin.exo11;

import java.util.ArrayList;

    public class Exemplaires extends Oeuvre {

    Oeuvre oeuvre;

    public Exemplaires(String nomAuteur, boolean primed, String titre, String langue) {
        super(nomAuteur, primed, titre, langue);
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }
}