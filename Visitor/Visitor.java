package Visitor;

import Factory.Buku;
import Factory.DVD;

public interface Visitor {
    void visitDVD(DVD dvd);
    void visitBuku(Buku buku);

}
