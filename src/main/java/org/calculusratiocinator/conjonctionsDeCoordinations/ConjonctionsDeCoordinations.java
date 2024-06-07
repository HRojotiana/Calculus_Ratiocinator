package org.calculusratiocinator.conjonctionsDeCoordinations;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.calculusratiocinator.affirmations.Affirmation;
import org.calculusratiocinator.valeurDeVerite.ValeurDeVerite;

import java.util.List;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public sealed abstract class ConjonctionsDeCoordinations permits Et, Ou, Donc{
    public abstract ValeurDeVerite calculerValeurDeVeriteDeLaCompositionDeDeuxAffirmations(Affirmation affirmation1, Affirmation affirmation2);
}
