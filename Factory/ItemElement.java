package Factory;

import Visitor.Visitor;

public interface ItemElement {
    public void input();                    // Factory
    public void accept(Visitor Visitor);         //Visitor accept
    public int calculateFee();          // Composite
}
