package Factory;

import Visitor.Visitor;

/*
 * Interface utama yang menyatukan & perantara (komunikasi) antara
 * design pattern
 * 
 */
public interface ItemElement {
    public void input();                    // Factory
    public void accept(Visitor Visitor);         //Visitor accept
    public int calculateFee();          // Composite

    //Composite method
    public void add(ItemElement item);
    public void remove(ItemElement item);
}
