package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Factory.ItemElement;
import Visitor.Visitor;

public class Section implements ItemElement {
    //List yang menyimpan seluruh ItemElemen dan section lainnya
    private final List<ItemElement> list = new ArrayList<>();    

    private String sectionCode;

    //Constructor yang diimplementasikan via setupSection dari Library
    public Section(String sectionCode, ItemElement... items){
        this.sectionCode = sectionCode;
        list.addAll(Arrays.asList(items));
    }

    //Visitor : Accept paramater visitor dan masuk ke level yang lebih dalam untuk setiap
    // item yang berupa itemElement
    @Override
    public void accept(Visitor visitor) {
        // Print section code
        System.out.println(sectionCode);

        //Memanggil node/leaf dari level 2 kebawah dst nya
        for(ItemElement items : list){
            items.accept(visitor);
        }
    }

    //Composite: Stream untuk mendapatkan setiap item yang berada pada list
    @Override
    public int calculateFee() {
        // TODO Auto-generated method stub
        return list.stream()
                    .mapToInt(ItemElement::calculateFee)
                    .sum();
    }

   /*
    * Getter & Setter
    */
    //================================================================================
    public List<ItemElement> getList() {
        return list;
    }

    public String getSectionCode() {
        return sectionCode;
    }
    
    @Override
    public String toString() {
        return "Section [list=" + list + ", sectionCode=" + sectionCode + "]\n";
    }
        //================================================================================

    //Method untuk add ItemElement pada section
    @Override
    public void add(ItemElement item) {
        // TODO Auto-generated method stub
        list.add(item);
    }

    //Method untuk menghapus ItemElement
    @Override
    public void remove(ItemElement item) {
        // TODO Auto-generated method stub
        list.remove(item);
    }
    
    @Override
    public void input() {}

    
}
