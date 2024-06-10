package Factory;

public class FactoryDVD extends Factory {

    @Override
    public ItemElement createItem(String judul, String pengarang,int fee) {
        // TODO Auto-generated method stub
        return new DVD(judul,pengarang,fee);
    }
    
}
