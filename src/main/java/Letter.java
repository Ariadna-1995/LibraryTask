public class Letter extends LibraryUnit implements Authoreable{
    private String author;

    public Letter(int id, String name) {
        super(id, name);

    }

    public Letter(int id, String name, String author) {
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
