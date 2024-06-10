package Factory;

import Visitor.Visitor;

public class DVD extends Item {

    private String tipe;
    public DVD(String judul, String pengarang, int fee) {
        super(judul, pengarang, fee);
        //TODO Auto-generated constructor stub
    }



    @Override
    public int calculateFee() {
        // TODO Auto-generated method stub
        return getFee();
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
    public void input() {
        // TODO Auto-generated method stub
        setTipe("[tipe]");
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accept'");
        visitor.visitDVD(this);
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setPengarang(String pengarang){
        this.pengarang =pengarang;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public DVD setTipe(String tipe) {
        this.tipe = tipe;
        return this;
    }

    public int getFee(){
        return this.fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("DVD:: Judul=%s ISBN=%s Tipe=%s ", judul,pengarang,tipe);
    }



    @Override
    public void visitBuku(Buku buku) {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void visitDVD(DVD dvd) {
        // TODO Auto-generated method stub
        System.out.println(this.toString());
    }
    
    


}
