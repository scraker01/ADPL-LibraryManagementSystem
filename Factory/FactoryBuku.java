
package Factory;

public class FactoryBuku extends Factory{

    @Override
    public ItemElement createItem(String judul, String pengarang,int fee) {
        // TODO Auto-generated method stub
        return new Buku(judul, pengarang,fee);
    }
    
}
