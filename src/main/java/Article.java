public class Article extends LibraryUnit implements Publisheable{
    private String publishingHouse;
    public Article(int id, String name) {
        super(id, name);
    }

    public Article(int id, String name, String publishingHouse) {
        this(id, name);
        this.publishingHouse = publishingHouse;
    }
    @Override
    public String getPublishingHouse() {
        return this.publishingHouse;
    }
    @Override
    public String toString() {
        return "id=" + getId() + " Название \"" + getName() + "\"" + " Издательский дом " + getPublishingHouse() + "\n";
    }
}
