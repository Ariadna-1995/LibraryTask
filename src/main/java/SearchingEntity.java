import java.util.List;
public interface SearchingEntity<T> {
    List<T> filterList(Library library, int id);
    List<T> filterList(Library library, String author);
    List<T> filterList(Library library, String publishingHouse);
    List<T> filterList(Library library, String genre);


}
