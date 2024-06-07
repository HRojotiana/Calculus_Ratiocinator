package org.calculusratiocinator.affirmations;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;
import org.calculusratiocinator.valeurDeVerite.Vrai;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Verite extends Affirmation{
    Vrai vraie = new Vrai();
    public Verite(String affirmation) {
        super(affirmation);
        this.valeurDeVerite = vraie;
    }
}
