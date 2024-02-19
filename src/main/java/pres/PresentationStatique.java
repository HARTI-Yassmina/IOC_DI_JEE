package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationStatique {
    public static void main(String[] args) {
        System.out.println("instanciation Statique");
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("valeur initial  = "+dao.getData());
        System.out.println("Resultats apres le calcul  = "+metier.calcul());

    }
}
