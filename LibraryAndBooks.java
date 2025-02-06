import java.util.ArrayList;
import java.util.List;


class Book {
    private String title;
    private String author;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    public void displayBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}


class Library {
    private String name;
    private List<Book> books; 

    
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }

    
    public void displayLibrary() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}


public class LibraryAndBooks{
    public static void main(String[] args) {
        Book book1 = new Book("The White Tiger", "Aravind Adiga");
        Book book2 = new Book("Midnight's Children", "Salman Rushdie");
        Book book3 = new Book("The God of Small Things", "Arundhati Roy");

        Library library1 = new Library("National Library");
        Library library2 = new Library("State Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        library1.displayLibrary();
        System.out.println();
        library2.displayLibrary();
    }
}
