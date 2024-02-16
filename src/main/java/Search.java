import java.util.List;

public class Search implements SearchingEntity<LibraryUnit>{
    @Override
    public List<LibraryUnit> filterList(Library library, int id){
        List<LibraryUnit> list = library.getListUnit()
                .stream()
                .filter(e -> id == e.getId()).toList();
        if (list.size() > 0) {
            System.out.printf("По вашему запрошенному ID=%d найдены следующие совпадения:\n", id);
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
        return list;

    }
    @Override
    public List<LibraryUnit> filterList(Library library, String author) {
        List<LibraryUnit> list = library.getListUnit()
                .stream()
                .filter(e -> e instanceof Authoreable && (((Authoreable) e)
                        .getAuthor()
                        .toLowerCase()
                        .contains(author.toLowerCase())))
                .toList();
        if (list.size() > 0) {
            System.out.printf("По вашему запрошенному Автор=%s найдены следующие совпадения:\n", author);
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
        return list;
    }
    @Override
    public List<LibraryUnit> filterList(Library library, String publishingHouse) {
        List<LibraryUnit> list = library.getListUnit()
                .stream()
                .filter(e -> e instanceof Publisheable && (((Publisheable) e)
                        .getPublishingHouse()
                        .toLowerCase()
                        .contains(publishingHouse.toLowerCase())))
                .toList();
        if (list.size() > 0) {
            System.out.printf("По вашему запрошенному Издательский дом=%s найдены следующие совпадения:\n", publishingHouse);
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
        return list;
    }
    @Override
    public List<LibraryUnit> filterList(Library library, String Genre) {
        List<LibraryUnit> list = library.getListUnit()
                .stream()
                .filter(e -> e instanceof Genreable && (((Genreable) e)
                        .getGenre()
                        .toLowerCase()
                        .contains(Genre.toLowerCase())))
                .toList();
        if (list.size() > 0) {
            System.out.printf("По вашему запрошенному Жанр=%s найдены следующие совпадения:\n", Genre);
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
        return list;
    }

}
