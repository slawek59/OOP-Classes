public class Book {
    private String title;
    private String author;
    private int pageCount;
    private  boolean isAvailable;

    public String Title (){
        return title;
    }

    public Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public boolean isThick(){
        return this.pageCount > 300;
    }

    public void borrowBook(){
        this.isAvailable = false;
    }

    public void returnBook(){
        this.isAvailable = true;
    }

}
