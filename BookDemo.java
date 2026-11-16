
import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    double price;

    static int count = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }

    void search(int id) {
        if (bookID == id) {
            System.out.println("Book Found by ID");
            display();
        }
    }

    void search(String t) {
        if (title.equalsIgnoreCase(t)) {
            System.out.println("Book Found by Title");
            display();
        }
    }

    Book costlier(Book b) {
        if (this.price > b.price) {
            return this;
        } else {
            return b;
        }
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b1 = new Book(101, "Java", "James", 450);
        Book b2 = new Book(102, "Python", "Guido", 600);
        Book b3 = new Book(103, "C Programming", "Dennis", 350);

        System.out.println("Book Details");

        b1.display();
        System.out.println();

        b2.display();
        System.out.println();

        b3.display();
        System.out.println();

        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();

        System.out.println("\nSearching by Book ID:");
        b1.search(id);
        b2.search(id);
        b3.search(id);

        sc.nextLine();

        System.out.print("\nEnter Book Title to search: ");
        String t = sc.nextLine();

        System.out.println("\nSearching by Title:");
        b1.search(t);
        b2.search(t);
        b3.search(t);

        Book expensive = b1.costlier(b2);
        expensive = expensive.costlier(b3);

        System.out.println("\nCostlier Book:");
        expensive.display();

        System.out.println("\nTotal Books Created: " + Book.count);

        sc.close();
    }
}
