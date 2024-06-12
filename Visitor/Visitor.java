package Visitor;

import Factory.Buku;
import Factory.DVD;

/*
 * Interface untuk visitor
 */
public interface Visitor {
    void visitDVD(DVD dvd);
    void visitBuku(Buku buku);

}
