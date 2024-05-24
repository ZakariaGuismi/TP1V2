package dao;

public class DaoImp  implements IDao{
    @Override
    public double getData(){
        System.out.println("vers base de donnes");
        double temp=Math.random()*40;
        return temp;
    }
}
