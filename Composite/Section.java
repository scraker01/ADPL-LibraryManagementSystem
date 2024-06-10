package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Factory.ItemElement;
import Visitor.Visitor;

public class Section implements ItemElement {
    private final List<ItemElement> list = new ArrayList<>();    

    private String sectionCode;

    public Section(ItemElement... items){
        list.addAll(Arrays.asList(items));
    }

    // public void add(ItemElement... items){
    //     list.addAll(Arrays.asList(items));
    // }

    @Override
    public int accept(Visitor visitor) {
        // TODO Auto-generated method stub
        return 0;
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

    
}
