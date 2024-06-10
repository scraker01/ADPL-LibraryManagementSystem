package Library;

import java.util.List;

import Composite.Section;
import Factory.Buku;
import Factory.DVD;
import Factory.FactoryBuku;
import Factory.FactoryDVD;
import Factory.ItemElement;
import Visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        FactoryBuku factoryBuku = new FactoryBuku();
        ItemElement buku = factoryBuku.orderItem("A","Pengarang",100);
        
        FactoryDVD factoryDvd = new FactoryDVD();
        ItemElement dvd = factoryDvd.orderItem("B","Pengarang",100);
        System.out.println(dvd.calculateFee());
        // System.out.println(buku);
        Library lib = new Library();
        lib.setupSection("Section A",
            new Section(
                "Section A-1",factoryBuku.orderItem("A","PengarangA",1000)
            ),
            new Section(
                "Section A-2",
                factoryBuku.orderItem("B", "PengarangB", 2000),
                factoryBuku.orderItem("C", "PengarangC", 2000),
                factoryDvd.orderItem("DVDA", "PengarangA", 5000),
                factoryDvd.orderItem("DVDB", "PengarangB", 3000),
                factoryDvd.orderItem("DVDC", "PengarangC", 2000)
            )
        );

        int totalFee = lib.calcSectionFees();
        // System.out.println(lib.getSection().getList());
        lib.visitAllInstances();
        
        System.out.println(totalFee);
    }

    

    
}
