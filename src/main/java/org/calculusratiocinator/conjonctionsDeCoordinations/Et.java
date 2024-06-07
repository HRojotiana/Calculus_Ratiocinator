package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.Affirmation;
import org.calculusratiocinator.valeurDeVerite.Faux;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;
import org.calculusratiocinator.valeurDeVerite.Vrai;

public final class Et extends ConjonctionsDeCoordinations {
    @Override
    public ValeurDeVerite calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(Affirmation affirmation1, Affirmation affirmation2) {
        Vrai vrai = new Vrai();
        Faux faux = new Faux();
        if(affirmation1.getValeurDeVerite() == vrai && affirmation2.getValeurDeVerite() == vrai){
            return vrai;
        }else{
            return faux;
        }
    }
}
