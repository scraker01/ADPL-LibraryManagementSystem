package Library;

import java.util.List;
import java.util.Scanner;

import Composite.Section;
import Factory.Buku;
import Factory.DVD;
import Factory.FactoryBuku;
import Factory.FactoryDVD;
import Factory.ItemElement;
import Visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        int sectionIdx;
        FactoryBuku factoryBuku = new FactoryBuku(); 
        FactoryDVD factoryDvd = new FactoryDVD();

        
        Scanner sc = new Scanner(System.in);
        

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

        // lib.setupSection("Section B", new Section("Code 1", new Section("Code 1-2", )));

        // int totalFee = lib.calcSectionFees();
        // System.out.println(totalFee);
   
        // lib.visitAllInstances();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a book");
            System.out.println("2. Add a DVD");
            System.out.println("3. Display library structure");
            System.out.println("4. Calculate cost");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String judulBuku = sc.nextLine();
                    System.out.print("Enter Pengarang: ");
                    String pengarangBuku = sc.nextLine();
                    System.out.print("Enter Fee: ");
                    int feeBuku = sc.nextInt();
                    ItemElement book = factoryBuku.orderItem(judulBuku,pengarangBuku,feeBuku);
                    System.out.print("Add to Section A-1 / A-2 ? \n");
                    System.out.println("1. Section A-1");
                    System.out.println("2. Section A-2");
                    sectionIdx = sc.nextInt()-1;
                    lib.getSpecificSection(sectionIdx).add(book);
                    // lib.add(book);
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.print("Enter DVD title: ");
                    String dvdTitle = sc.nextLine();
                    System.out.print("Enter Pengarang: ");
                    String pengarang = sc.nextLine();
                    System.out.print("Enter Fee: ");
                    int fee = sc.nextInt();
                    
                    ItemElement dvd = factoryDvd.orderItem(dvdTitle,pengarang,fee);
                    System.out.print("Add to Section A-1 / A-2 ? \n");
                    System.out.println("1. Section A-1");
                    System.out.println("2. Section A-2");
                    sectionIdx = sc.nextInt()-1;
                    lib.getSpecificSection(sectionIdx).add(dvd);
                    System.out.println("DVD added.");
                    break;
                case 3:
                    lib.visitAllInstances();
                    break;
                case 4:
                    System.out.println("Total : "+lib.calcSectionFees());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            System.out.println();
        }

        
    }

    

    
}
