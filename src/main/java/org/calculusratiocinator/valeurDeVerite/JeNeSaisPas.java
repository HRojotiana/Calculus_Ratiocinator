package org.calculusratiocinator.valeurDeVerite;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public final class JeNeSaisPas extends ValeurDeVerite {
    String valeur;

    public JeNeSaisPas() {
        this.valeur = "jenesaispas";
    }
}
