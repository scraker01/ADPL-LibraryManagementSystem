package Factory;

import java.util.Scanner;

import Visitor.Visitor;

public interface ItemElement {
    public void input();                    // Factory
    public int accept(Visitor visitor);         //Visitor accept
    public int calculateFee();          // Composite
}
