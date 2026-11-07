package ma.tp.presentation;

import ma.tp.dao.DaoImpl;
import ma.tp.metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);   // injection via le setter
        // ou : MetierImpl metier = new MetierImpl(dao);  (via le constructeur)
        System.out.println("Résultat = " + metier.calcul());
    }
}