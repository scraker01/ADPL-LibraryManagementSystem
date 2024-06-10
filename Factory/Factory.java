package Factory;

public abstract class Factory {
    
    public ItemElement orderItem(String judul, String pengarang,int fee){
        ItemElement item = createItem(judul,pengarang,fee);
        item.input();
        return item;
    }

    public abstract ItemElement createItem(String judul, String pengarang,int fee);
}
