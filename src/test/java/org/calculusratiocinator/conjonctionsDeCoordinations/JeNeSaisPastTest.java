package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.AffirmationQuelconque;
import org.calculusratiocinator.valeurDeVerite.JeNeSaisPas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JeNeSaisPastTest {
    @Test
    void lou_est_généreux(){
        var jenesaipas = new JeNeSaisPas();
        var affirmation_1 = new AffirmationQuelconque("Lou est généreux");
        assertEquals(jenesaipas.getValeur(), affirmation_1.getValeurDeVerite().getValeur());
    }
}
