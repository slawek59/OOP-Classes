import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> listOfBooks = new LinkedList<>();

    public void addBook(Book book){
        this.listOfBooks.add(book);
    }

    public void displayAvailableBook(){
        for(Book book : listOfBooks){
            System.out.println(book.Title());
        }
    }
}
