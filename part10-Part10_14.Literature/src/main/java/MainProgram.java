
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String bookName;

        while (true) {

            System.out.print("Input the name of the book, empty stops: ");
            bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int bookAgeRecommendation = Integer.valueOf(scanner.nextLine());

            Book book = new Book(bookName, bookAgeRecommendation);

            books.add(book);
            
            System.out.println();

        }

        System.out.println(books.size() + " Books in total.\n");

        System.out.println("Books:");

//        for (Book b : books) {
//            System.out.println(b);
//        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getBookAgeRecommendation)
                .thenComparing(Book::getBookName);

        Collections.sort(books, comparator);

        for (Book b : books) {
            System.out.println(b);
        }

    }

}
