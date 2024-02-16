public class Book extends LibraryUnit implements Authoreable{
    private String author;

    public Book(int id, String name) {
        super(id, name);

    }

    public Book(int id, String name, String author) {
        this(id, name);
        this.author = author;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
    @Override
    public String toString() {
        return "id=" + getId() + " Название \"" + getName() + "\"" + " Автор " + getAuthor() + "\n";
    }

}
