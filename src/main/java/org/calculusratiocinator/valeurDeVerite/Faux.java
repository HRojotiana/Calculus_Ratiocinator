package org.calculusratiocinator.valeurDeVerite;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public final class Faux extends ValeurDeVerite{
    private String valeur;

    public Faux() {
        this.valeur = "fausse";
    }

}
