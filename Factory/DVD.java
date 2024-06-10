package Factory;

import Visitor.Visitor;

public class DVD extends Item implements ItemElement{

    private String tipe;

    protected DVD (String judul, String pengarang, String tipe){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tipe = tipe;
    }

    @Override
    public String getJudul() {
        // TODO Auto-generated method stub
        return this.judul;
    }

    @Override
    public String getPengarang() {
        // TODO Auto-generated method stub
        return this.pengarang;
    }
    

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int accept(Visitor visitor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

    public String getTipe() {
        return this.tipe;
    }
    
}
