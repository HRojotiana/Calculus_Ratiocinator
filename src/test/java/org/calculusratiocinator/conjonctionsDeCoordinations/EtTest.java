package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.AffirmationQuelconque;
import org.calculusratiocinator.valeurDeVerite.Faux;
import org.calculusratiocinator.valeurDeVerite.Vrai;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtTest {
    @Test
    void vraie_et_vraie_donne_vraie(){
        var vrai = new Vrai();
        AffirmationQuelconque affirmationVraie = new AffirmationQuelconque(vrai, "affirmation vraie");
        AffirmationQuelconque affirmationVraie2 = new AffirmationQuelconque(vrai, "affirmation vraie");

        var compositionAvecEt = new Et();
        assertEquals("vraie", compositionAvecEt.calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(affirmationVraie, affirmationVraie2).getValeur());
    }

    @Test
    void vraie_et_fausse_donne_fausse(){
        var vrai = new Vrai();
        var faux = new Faux();
        AffirmationQuelconque affirmationVraie = new AffirmationQuelconque(vrai, "affirmation vraie");
        AffirmationQuelconque affirmationFausse = new AffirmationQuelconque(faux, "affirmation fausse");
        var compositionAvecEt = new Et();
        assertEquals("fausse", compositionAvecEt.calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(affirmationVraie,affirmationFausse).getValeur());
    }
}
