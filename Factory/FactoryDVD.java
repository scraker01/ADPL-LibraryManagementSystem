package Factory;

/*
 * Konkret factory dvd
 */
public class FactoryDVD extends Factory {

    /*
     * Override Method dari factory untuk create Objek DVD
     */
    @Override
    public ItemElement createItem(String judul, String pengarang,int fee) {
        // TODO Auto-generated method stub
        return new DVD(judul,pengarang,fee);
    }
    
}
