package JavaA.Npolimorfismo.classes;

public class DatabaseDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("salvando dados");
    }
}
