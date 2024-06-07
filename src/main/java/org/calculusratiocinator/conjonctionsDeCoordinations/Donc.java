package org.calculusratiocinator.conjonctionsDeCoordinations;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.calculusratiocinator.affirmations.Affirmation;
import org.calculusratiocinator.valeurDeVerite.Faux;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;
import org.calculusratiocinator.valeurDeVerite.Vrai;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public final class Donc extends ConjonctionsDeCoordinations {

    @Override
    public ValeurDeVerite calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(Affirmation affirmation1, Affirmation affirmation2) {
        Vrai vrai = new Vrai();
        Faux faux = new Faux();
        if(affirmation1.getValeurDeVerite().getValeur() == vrai.getValeur() && affirmation2.getValeurDeVerite().getValeur() == faux.getValeur()){
            return faux;
        }else{
            return vrai;
        }
    }
}
