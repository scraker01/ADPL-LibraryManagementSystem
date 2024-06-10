package Library;

import Composite.Section;
import Factory.ItemElement;

public class Library {
    private Section section;

    public Library(){}

    public void setupSection(ItemElement... items){
        this.section = new Section(items);
    }

    public int calcSectionFees(){
        return section.calculateFee();
    }
}
