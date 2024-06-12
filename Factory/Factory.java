package Factory;

public abstract class Factory {
    
    //Method untuk menginstansiasi objek dan setup attribute
    /*
     * Digunakan oleh Concrete Factory untuk menghasilkan objek
     */
    public ItemElement orderItem(String judul, String pengarang,int fee){
        ItemElement item = createItem(judul,pengarang,fee);
        item.input();
        return item;
    }

    //Factory Method
    /*
     * Abstract method untuk di override pada objek concrete/konkret
     * Digunakan untuk menghasilkan objek berkaitan
     */
    public abstract ItemElement createItem(String judul, String pengarang,int fee);
}
