package ma.tp.metier;

import ma.tp.dao.IDao;

public class MetierImpl implements IMetier {

    // Couplage faible : on dépend de l'interface
    private IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI / 2 * Math.cos(t);
        return res;
    }

    // Setter pour injecter la dépendance
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}