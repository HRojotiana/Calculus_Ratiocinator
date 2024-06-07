package org.calculusratiocinator.valeurDeVerite;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public sealed abstract class ValeurDeVerite permits Vrai, Faux, JeNeSaisPas {
    String valeur;
}
