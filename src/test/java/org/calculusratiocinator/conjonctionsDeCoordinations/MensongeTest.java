package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.Mensonge;
import org.calculusratiocinator.valeurDeVerite.Faux;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MensongeTest {
    @Test
    void lou_est_pauvre(){
        var faux = new Faux();
        var mensonge_1 = new Mensonge("Lou est pauvre");
        assertEquals(faux.getValeur(), mensonge_1.getValeurDeVerite().getValeur());
    }
}
