package org.calculusratiocinator.valeurDeVerite;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Setter
public final class Vrai extends ValeurDeVerite{
    private String valeur;

    public Vrai() {
        this.valeur = "vraie";
    }

    @Override
    public String getValeur() {
        return valeur;
    }
}
