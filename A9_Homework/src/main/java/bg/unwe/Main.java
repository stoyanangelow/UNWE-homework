package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stoyan Angelow
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter new title: ");
            String line = scanner.nextLine();

            if (line.length() > 0) {
                Book book = new Book();
                book.setTitle(line);

                for (int j = 0; j < 2; j++) {
                    System.out.print("Enter new author: ");
                    line = scanner.nextLine();

                    if (line.length() > 0) {
                        Author author = new Author();
                        Country country = new Country();

                        author.setName(line);

                        System.out.print("Enter a country: ");
                        String name = scanner.nextLine();

                        country.setName(name);

                        author.setCountry(country);

                        book.addAuthor(author);

                    }

                }
                books.add(book);
            }

        }
        System.out.println("");

        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);

            System.out.print("Book " + (i + 1) + ": Title = " + b.getTitle());

            for (int k = 0; k < b.getAuthorsCount(); k++) {
                Author a = b.getAuthor(k);

                System.out.print(", Author " + (k + 1)
                        + ":[ Name = " + a.getName()
                        + ", Country = ]" + a.getCountry().getName());
            }

            System.out.println("");
        }

    }
}
