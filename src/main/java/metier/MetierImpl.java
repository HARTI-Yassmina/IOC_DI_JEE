package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao;

    @Override
    public double calcul() {
        double temperature = dao.getData();
        double res = temperature*55/Math.cos(temperature*Math.PI);
        return res;
    }
    public void  setDao(IDao dao ){
        this.dao = dao;
    }
}
