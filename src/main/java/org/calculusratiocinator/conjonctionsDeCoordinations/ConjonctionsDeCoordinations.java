package org.calculusratiocinator.conjonctionsDeCoordinations;

import org.calculusratiocinator.affirmations.Affirmation;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;

import java.util.List;

public sealed abstract class ConjonctionsDeCoordinations permits Et, Ou, Donc{
    public abstract ValeurDeVerite calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(Affirmation affirmation1, Affirmation affirmation2);
}
