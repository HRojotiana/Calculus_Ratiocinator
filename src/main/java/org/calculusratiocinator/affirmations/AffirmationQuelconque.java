package org.calculusratiocinator.affirmations;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.calculusratiocinator.valeurDeVerite.JeNeSaisPas;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class AffirmationQuelconque extends Affirmation{
    JeNeSaisPas jeNeSaisPas = new JeNeSaisPas();
    public AffirmationQuelconque(ValeurDeVerite valeurDeVerite, String affirmation) {
        super(valeurDeVerite, affirmation);
    }

    public AffirmationQuelconque(String affirmation) {
        super(affirmation);
        this.valeurDeVerite = jeNeSaisPas;
    }
}
