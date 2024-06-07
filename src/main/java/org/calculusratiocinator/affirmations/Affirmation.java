package org.calculusratiocinator.affirmations;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Affirmation {
    ValeurDeVerite valeurDeVerite;
    String affirmation;

    public Affirmation(ValeurDeVerite valeurDeVerite, String affirmation) {
        this.valeurDeVerite = valeurDeVerite;
        this.affirmation = affirmation;
    }

    public Affirmation(String affirmation){
        this.affirmation = affirmation;
    }
}
