package Library;

import Composite.Section;
import Factory.Buku;
import Factory.DVD;
import Factory.ItemElement;
import Visitor.Visitor;


public class Library implements Visitor {
    private Section section;

    public Library(){}

    //Composite: Method untuk setup section" dalam library
    public void setupSection(String name, ItemElement... items){
        this.section = new Section(name,items);
    }

    
    //Visitor: Method untuk visit setiap node dan leaf dari library / root
    public void visitAllInstances(){
        System.out.println("\n"+section.getSectionCode());

        //Memanggil ItemElement yang ada pada level 2 / dibawah root
        for(ItemElement item: section.getList()){
            item.accept(this);
            
        }
    }

    
    
    //Tambah objek yang memiliki interface ItemElement ke section
    public void add(ItemElement item){
        this.section.add(item);
    }

    //Hapus objek yang memiliki interface ItemElement di section
    public void remove(ItemElement item){
        this.section.remove(item);
    }

    //Get specific inner section
    public Section getSpecificSection(int sectionIdx){
        return (Section)this.section.getList().get(sectionIdx);
    }

    //Get section fees
    public int calcSectionFees(){
        return section.calculateFee();
    }

    //Gett Section
    public Section getSection() {
        return section;
    }

    //Method visitBuku
    @Override
    public void visitBuku(Buku buku) {
        System.out.println(buku.toString());
        
    }

    //Method visitDVD
    @Override
    public void visitDVD(DVD dvd) {
        System.out.println(dvd.toString());
        
    }

}
