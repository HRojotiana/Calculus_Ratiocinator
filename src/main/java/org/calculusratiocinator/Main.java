package org.calculusratiocinator;

import org.calculusratiocinator.affirmations.Affirmation;
import org.calculusratiocinator.affirmations.AffirmationQuelconque;
import org.calculusratiocinator.affirmations.Verite;
import org.calculusratiocinator.conjonctionsDeCoordinations.Et;
import org.calculusratiocinator.valeurDeVerite.Vrai;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Verite verite = new Verite("toujours vraie");
        System.out.println(verite.getValeurDeVerite().getValeur());
    }
}