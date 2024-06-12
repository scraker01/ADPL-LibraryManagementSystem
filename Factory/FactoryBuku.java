
package Factory;

/*
 * Konkret Factory Buku
 * 
 */
public class FactoryBuku extends Factory{

    /*
     * Override method dari factory untuk create objek Buku
     */
    @Override
    public ItemElement createItem(String judul, String pengarang,int fee) {
        // TODO Auto-generated method stub
        return new Buku(judul, pengarang,fee);
    }
    
}
