public abstract class LibraryUnit {
    private String name;
    private final int id;
    protected LibraryUnit(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return this.name;
    }
    public abstract String toString();
}
