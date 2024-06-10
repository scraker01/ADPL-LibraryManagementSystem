
package Factory;

public class FactoryBuku extends MainFactory{

    @Override
    public Item createItem(String judul, String pengarang, String penerbit, String isbn) {
        // TODO Auto-generated method stub
        return new Buku(null, null, null, null);
    }
    
}
