public class BookDetails{
    public static void main(String []args){
        Book book = new Book("Amit Kumar", "Java Programming", 1000);
        book.getAuthorName();
        book.getTitle();
        book.getPrice();
        book.displayDetails();
    }
}