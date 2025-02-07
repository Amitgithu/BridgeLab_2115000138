class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() { 
        return name; 
    }
    public String getBio() { 
        return bio; 
    }
}


class Book {
    private String title;
    private int publicationYear;
    private Author author; 

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
    
    public void displayDetails() {
        System.out.println("=== Book Details ===");
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + author.getName());
        System.out.println("Bio: " + author.getBio());
        System.out.println("***************************************");
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        Author author1 = new Author("Chetan Bhagat", "Indian author, columnist, and speaker.");
        Author author2 = new Author("Arundhati Roy", "Indian author, best known for her novel The God of Small Things.");
        Author author3 = new Author("R.K. Narayan", "Indian writer, known for his works set in Malgudi.");
        
        Book book1 = new Book("Five Point Someone", 2004, author1);
        Book book2 = new Book("The God of Small Things", 1997, author2);
        Book book3 = new Book("The English Teacher", 1943, author3);

        
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
