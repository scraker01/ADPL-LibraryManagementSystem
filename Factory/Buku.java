package Factory;

import Visitor.Visitor;

public class Buku extends Item{
    

    public Buku(String judul, String pengarang, int fee) {
        super(judul, pengarang,fee);
        //TODO Auto-generated constructor stub
    }

    
    @Override
    public void input() {
        // TODO Auto-generated method 
        
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitBuku(this);
    }


    @Override
    public String getJudul() {
        return this.judul;
    }

    @Override
    public String getPengarang() {
        return this.pengarang;
    }

    public int getFee(){
        return this.fee;
    }

    public void setPengarang(String pengarang){
        this.pengarang =pengarang;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Buku:: Judul=%s Pengarang=%s ", judul,pengarang);
    }

    @Override
    public int calculateFee() {
        // TODO Auto-generated method stub
        return getFee();    
    }

    @Override
    public void visitBuku(Buku buku) {
        // TODO Auto-generated method stub
        System.out.println(this.toString());
    }

    @Override
    public void visitDVD(DVD dvd) {
        
    }

    @Override
    public void add(ItemElement item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(ItemElement item) {
        // TODO Auto-generated method stub
        
    }

        
    
        
}
