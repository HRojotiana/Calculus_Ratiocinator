package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.Mensonge;
import org.calculusratiocinator.affirmations.Verite;
import org.calculusratiocinator.valeurDeVerite.Faux;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoncTest {
    @Test
    void lou_est_beau_donc_lou_est_pauvre(){
        var faux = new Faux();
        var verite_1 = new Verite("Lou est beau");
        var mensonge_1 = new Mensonge("Lou est pauvre");
        var compositionDonc = new Donc();
        assertEquals(faux.getValeur(), compositionDonc.calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(verite_1, mensonge_1).getValeur());
    }
}
