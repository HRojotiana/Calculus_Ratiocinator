package org.calculusratiocinator.affirmations;

import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;

public abstract class Affirmation {
    ValeurDeVerite valeurDeVerite;

    public Affirmation(ValeurDeVerite valeurDeVerite) {
        this.valeurDeVerite = valeurDeVerite;
    }

    public ValeurDeVerite getValeurDeVerite() {
        return valeurDeVerite;
    }
}
