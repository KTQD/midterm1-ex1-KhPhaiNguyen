public class Book extends Item {
    public String author;
    public int numberOfPages;
    public String genre;

    Book(String name, String description, String ID, int price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    void showInfo() {
        System.out.println("Name: " + name + "\nDescription: " + getDescription() + "\nID: " + ID + "\nPrice: " + price
            + "\nAuthor: " + author + "\nNumber of pages: " + numberOfPages + "\nGenre: " + genre);
    }
}
