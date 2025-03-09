public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 1225);

        System.out.println(book1.isThick()); // Output: false
        System.out.println(book2.isThick()); // Output: true

        Dog Stefan = new Dog();
        Dog Marian = new Dog();

        Stefan.bark();
        Marian.bark();

        Movie starwars = new Movie("Star Wars", Genre.SCIENCE_FICTION, 10.0, 120);
        System.out.println(starwars.getTitle());
        System.out.println(starwars.isRecommended());
    }
}