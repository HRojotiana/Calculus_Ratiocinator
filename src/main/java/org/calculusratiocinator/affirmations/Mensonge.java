package org.calculusratiocinator.affirmations;

import org.calculusratiocinator.valeurDeVerite.Faux;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;

public class Mensonge extends Affirmation{
    Faux fausse = new Faux();

    public Mensonge(String affirmation) {
        super( affirmation);
        this.valeurDeVerite = fausse;
    }
}
