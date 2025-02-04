public class Book{
    private String author;
    private String title;
    private final String isbn;
    private static String libraryName = "Central Library";

    public Book(){
        this.author = "Anonymous";
        this.title = "";
        this.isbn = "";
    }

    public Book(String author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthorName(){
        return this.author;
    }

    public void setAuthorName(String newAuthorName){
        this.author = newAuthorName;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getIsbnNumber(){
        return this.isbn;
    }

    public static String displayLibraryName(){
        return libraryName;
    }

    public static boolean isInstanceOf(Book obj){
        return (obj instanceof Book);
    }

    public void displayDetails(){
        System.out.println("Library Name is : " + this.libraryName);
        System.out.println("Author Name of Book is : " + this.author);
        System.out.println("Title of the Book is : " + this.title);
        System.out.println("ISBN Number of Book is : " + this.isbn);
        System.out.println("******************************************");
    }
}

class Main{
    public static void main(String []args){
        Book book1 = new Book("Amit Kumar", "Java Programming", "9872-8463-2849");
        if(Book.isInstanceOf(book1)){
            book1.displayDetails();
        }

        Book book2 = new Book("Mohit Agarwal", "Lets learn with C", "8756-3647-2947");
        if(Book.isInstanceOf(book2)){
            book2.displayDetails();
        }
    }
}