package Factory;

import Visitor.Visitor;

public interface ItemElement {
    public void prepare();

    public int accept(Visitor visitor);
}
