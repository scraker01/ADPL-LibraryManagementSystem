package Library;

import java.util.List;

import Composite.Section;
import Factory.Buku;
import Factory.DVD;
import Factory.ItemElement;
import Visitor.Visitor;


public class Library implements Visitor {
    private Section section;

    public Library(){}

    public void setupSection(String name, ItemElement... items){
        this.section = new Section(name,items);
    }

    public int calcSectionFees(){
        return section.calculateFee();
    }

    public Section getSection() {
        return section;
    }

    public void visitAllInstances(){
        System.out.println("\n"+section.getSectionCode());
        for(ItemElement item: section.getList()){
            item.accept(this);
            
        }
    }

    @Override
    public void visitBuku(Buku buku) {
        System.out.println(buku.toString());
        
    }

    @Override
    public void visitDVD(DVD dvd) {
        System.out.println(dvd.toString());
        
    }

    public void add(ItemElement item){
        this.section.add(item);
    }

    public void remove(ItemElement item){
        this.section.remove(item);
    }

    public Section getSpecificSection(int sectionIdx){
        return (Section)this.section.getList().get(sectionIdx);
    }
    
}
