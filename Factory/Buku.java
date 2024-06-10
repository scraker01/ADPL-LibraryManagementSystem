package Factory;

import Visitor.Visitor;

public class Buku extends Item implements ItemElement {
    
    private String penerbit;
    private String isbn;

    public Buku(String judul, String pngrg, String pnrbit, String isbn){
        this.judul = judul;
        this.penerbit = pnrbit;
        this.pengarang = pngrg;
        this.isbn = isbn;
    }

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int accept(Visitor visitor) {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public String getJudul() {
        return this.judul;
    }


    @Override
    public String getPengarang() {
        return this.pengarang;
    }



    public String getPenerbit() {
        return this.penerbit;
    }



    public String getIsbn() {
        return this.isbn;
    }
        
}
