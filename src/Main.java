import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book b1 = new Book("Kürk Matolu Madonna", 105, "Sabahattin Ali", 1999);
        Book b2 = new Book("Notre Dame'ın Kamburu", 502, "Victor Hugo", 1898);
        Book b3 = new Book("Şeker Portakalı", 50, "J. M. Vasconcelos", 2012);
        Book b4 = new Book("Uçurtma Avcısı", 674, "Khaled Husseini", 1850);
        Book b5 = new Book("Fareler ve İnsanlar", 118, "Jhon Steinback", 1993);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);


        System.out.println("--------------------------------------");
        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(), book.getWriterName()));
        for (String i : bookMap.keySet()) {
            System.out.println("Book: " + i + "\nWriter: " + bookMap.get(i));
        }
        System.out.println("--------------------------------------");

        //Filter method()
        List<Book> listBook = bookList.stream().filter(book -> book.getNumberPage() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b ->
                System.out.printf("Book : %-25s Page Number : %-5d Writer : %-20s Date : %-4d \n",
                        b.getBookName(),
                        b.getNumberPage(), b.getWriterName(), b.getDate()));

        System.out.println("--------------------------------------");


        //Count method
        long count = bookList.stream().count();
        System.out.println("Number of books: " + count);
    }


    }
