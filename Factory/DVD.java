package Factory;

import Visitor.Visitor;

/*
 * Konkret Objek yang meng-inherit Item (ItemElement+Visitor)
 */
public class DVD extends Item {

    public DVD(String judul, String pengarang, int fee) {
        super(judul, pengarang, fee);
        //TODO Auto-generated constructor stub
    }


    //Visitor: memanggil method objek konkret
    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accept'");
        visitor.visitDVD(this);
    }

    //Visitor : method print keterangan objek DVD
    @Override
    public void visitDVD(DVD dvd) {
        // TODO Auto-generated method stub
        System.out.println(this.toString());
    }


    /*
     * Setter & Getter
     */
    //=======================================================
    public void setPengarang(String pengarang){
        this.pengarang =pengarang;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public int getFee(){
        return this.fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
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
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("DVD:: Judul=%s Pengarang=%s", judul,pengarang);
    }
    //=======================================================


    //Method kosong untuk keperluan implementasi
    //===================================================

    @Override
    public void input() {}

    @Override
    public void visitBuku(Buku buku) {}
   
    @Override
    public void add(ItemElement item) {}

    @Override
    public void remove(ItemElement item) {}
    
    //===================================================
    

}
