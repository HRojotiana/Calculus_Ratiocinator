package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.Verite;
import org.calculusratiocinator.valeurDeVerite.Vrai;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VeriteTest {
    @Test
    void lou_est_beau(){
        var vrai = new Vrai();
        var vérité_1 = new Verite("Lou est beau");
        assertEquals(vrai.getValeur(), vérité_1.getValeurDeVerite().getValeur());
    }
}
