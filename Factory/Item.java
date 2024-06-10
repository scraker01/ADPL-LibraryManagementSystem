package Factory;

public abstract class Item implements ItemElement {
    public String judul;
    public String pengarang;
    public int fee;
  
    
    public Item(String judul, String pengarang,int fee) {
        //TODO Auto-generated constructor stub
        this.judul = judul;
        this.pengarang=pengarang;
        this.fee=fee;
    }
    public abstract String getJudul();
    public abstract String getPengarang() ;
    
}
