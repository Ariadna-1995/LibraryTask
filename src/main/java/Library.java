import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<LibraryUnit> listUnit;
    public Library(String name, List<LibraryUnit> listUnit) {
        this.name = name;
        this.listUnit = new ArrayList<>();
    }
    public Library addEntity(LibraryUnit libraryUnit) {
        listUnit.add(libraryUnit);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<LibraryUnit> getListUnit() {
        return this.listUnit;
    }
}
