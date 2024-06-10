package Factory;

public abstract class MainFactory {
    
    public Item orderItem(){
        Item item = createItem();
        // item.prepare();
        return item;
    }

    public abstract Item createItem();
}
