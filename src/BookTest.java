//import library.model.Book;
//import library.storage.DynamicArrayForBook;
import model.Book;
import storage.DynamicArrayForBook;

import java.util.Scanner;

public class BookTest implements Comand {
    private static Scanner scanner = new Scanner(System.in);
    private static DynamicArrayForBook dnb = new DynamicArrayForBook();

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Grqi anvanum@:");
//        String title=scanner.nextLine();
//        System.out.println(title);
//        System.out.println("Hexinaki anun@");
//        String outerName=scanner.nextLine();
//        System.out.println(outerName);
//        System.out.println("gin@");
//        String price=scanner.nextLine();//price petqe liner int,bayc karelie haytararel String qani vor nextLine(0 metod@ veradardznuma  String
//        System.out.println(price);//ev aynuhetev setPrice metod@ kancheluc ogtagorcenq Integer.parseint(price) ev metodin ktanq int tipi
//        System.out.println("qanak@");
//        int count=scanner.nextInt();//qani vor count Int tipie ev NextLine()metod@ verdardznume String menq Ogtagorcum enq NextInt()metod@
//        System.out.println(count);
//        Book book=new Book();
//        book.setTitle(title);
//        book.setOuterName(outerName);
//        book.setPrice(Integer.parseInt(price));
//        book.setCount(count);
//        System.out.println(book);
//        Book book1 = new Book("Kaxvacutyun", "Syune Sevada", 4250, 3);
//        System.out.println(book1);

/////urish tnayin
//        Scanner scanner = new Scanner(System.in);
//        DynamicArrayForBook dnb=new DynamicArrayForBook();
//        System.out.println("mutqagreq grqeri qanak:");
//        int count=Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i <count ; i++) {
//            System.out.println("mutqagreq grqi anvanum@:");
//            String title = scanner.nextLine();
//            System.out.println(title);
//            System.out.println("mutqagreq hexinaki anun@:");
//            String outerName = scanner.nextLine();
//            System.out.println(outerName);
//            System.out.println("grqi gin@:");
//            String price = scanner.nextLine();
//            System.out.println("mutqagreq grqi qanak@");
//            String cont=scanner.nextLine();
//            Book book = new Book();
//            book.setTitle(title);
//            book.setOuterName(outerName);
//            book.setPrice(Integer.parseInt(price));
//            book.setCount(Integer.parseInt(cont));
//            System.out.println(book);
//            dnb.add(book);
//        }
//        System.out.println("nermuceq grqi vernagir@ girq@ pntrelu hamar");
//        String str=scanner.nextLine();
//        System.out.println(dnb.getBookByTitle(str));


        //tnayin@ Kareni tarberakov
        boolean isRun = true;
        while (isRun) {
            showComand();
            String comand = scanner.nextLine();
            switch (comand) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_BY_TITLE:
                    searchBookByBokk();
                    break;
                default:
                    System.out.println("wrong comand");
            }
        }
    }

    private static void addBook() {
        System.out.println("please input book data");
        System.out.println("title");
        String title = scanner.nextLine();
        System.out.println("outerName");
        String outerName = scanner.nextLine();
        System.out.println("price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("count");
        int count = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title, outerName, price, count);
        dnb.add(book);
        System.out.println("book was add");
    }

    private static void searchBookByBokk() {
        System.out.println("please input title for search");
        String sttitle = scanner.nextLine();
        Book searchbook = dnb.getBookByTitle(sttitle);
//                    System.out.println(dnb.getBookByTitle(sttitle));
        if (searchbook == null) {
            System.out.println("book with" + sttitle + "title does not exist");
        } else {
            System.out.println(searchbook);
        }
    }

    private static void showComand() {
        System.out.println("please input" + EXIT + "for exit");
        System.out.println("please input " + ADD_BOOK + "for Add Book");
        System.out.println("please input " + SEARCH_BY_TITLE + "for search title by book");
    }
}
