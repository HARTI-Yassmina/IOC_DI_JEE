package dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        double temp = Math.random()*45 ;

        return temp;
    }
}
