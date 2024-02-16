import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        LibraryUnit book1 = new Book(1, "Гордость и предубеждение", "Джейн Остен");
        LibraryUnit book2 = new Book(2, "Великий Гэтсби", "Ф.С.Фицджеральд");
        LibraryUnit book3 = new Book(3, "Автостопом по Галактике", "Дуглас Адамс");
        LibraryUnit book4 = new Book(4, "Граф Монте-Кристо", "Александр Дюма");
        LibraryUnit article1 = new Article(5, "Химический состав и фармакологическая активность водного экстракта пихты сибирской", "Мир и человек");
        LibraryUnit Film1 = new Film(6, "Ла-ла ленд", "Мюзикл");
        LibraryUnit Film2 = new Film (7, "Девушка с татуировкой дракона", "Боевик");
        LibraryUnit Film3 = new Film(8, "Джентльмены удачи", "Комедия");
        LibraryUnit letter1 = new Letter(9, "Переписка Ивана Грозного и Андрея Курбского", "Иван Грозный и Андрей Курбский");

        Library library1 = new Library("Библиотека им. Ленина", new ArrayList<>());
        library1.addEntity(book2).addEntity(article1).addEntity(Film3)
                .addEntity(book3).addEntity(letter1).addEntity(Film2)
                .addEntity(book1).addEntity(book4).addEntity(Film1);
        Search search = new Search();
        List<LibraryUnit> searchList = search.filterList(library1,3);
        System.out.println(searchList);
        List<LibraryUnit> searchList1 = search.filterList(library1,"Дуглас Адамс");
        System.out.println(searchList1);






    }
}
