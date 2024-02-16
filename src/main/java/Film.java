public class Film extends LibraryUnit implements Genreable{
    private String name;
    private String Genre;

    public Film(int id, String name) {
        super(id);
        this.name = name;
    }
    public Film(int id, String name, String Genre) {
        this(id, name);
        this.Genre = Genre;
    }
    @Override
    public String toString() {
        return "id=" + getId() + " Название \"" + getName() + "\"" + " Жанр " + getGenre() + "\n";
    }

}
