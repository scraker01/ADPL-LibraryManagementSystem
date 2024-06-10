package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Factory.ItemElement;
import Visitor.Visitor;

public class Section implements ItemElement {
    private final List<ItemElement> list = new ArrayList<>();    

    private String sectionCode;

    public Section(String sectionCode, ItemElement... items){
        this.sectionCode = sectionCode;
        list.addAll(Arrays.asList(items));
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        for(ItemElement items : list){
            items.accept(visitor);
        }
    }

    @Override
    public int calculateFee() {
        // TODO Auto-generated method stub
        return list.stream()
                    .mapToInt(ItemElement::calculateFee)
                    .sum();
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        
    }

    public List<ItemElement> getList() {
        return list;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public Section getSection(){
        return this;
    }

    @Override
    public String toString() {
        return "Section [list=" + list + ", sectionCode=" + sectionCode + "]\n";
    }
    
    
    
}
