package Factory;

public class FactoryDVD extends MainFactory {

    @Override
    public Item createItem() {
        // TODO Auto-generated method stub
        return new DVD(null, null, null);
    }
    
}
