package pr2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>(10);
        Human human_1 = new Human(19, "Петр", "Иванов", LocalDate.of(2003, 1, 10), 65);
        Human human_2 = new Human(47, "Николай", "Алексеев", LocalDate.of(1975, 4, 5), 82);
        Human human_3 = new Human(31, "Иван", "Жердев", LocalDate.of(1991, 6, 19), 75);
        Human human_4 = new Human(26, "Арина", "Баранова", LocalDate.of(1996, 6, 27), 101);
        Human human_5 = new Human(53, "Андрей", "Ульянов", LocalDate.of(1969, 10, 1), 89);
        Human human_6 = new Human(17, "Оксана", "Самойлова", LocalDate.of(2005, 3, 9), 53);
        Human human_7 = new Human(36, "Михаил", "Рыбин", LocalDate.of(1986, 8, 13), 82);
        Human human_8 = new Human(41, "Светлана", "Мазюткина", LocalDate.of(1981, 2, 23), 57);
        Human human_9 = new Human(80, "Нелли", "Моисеева", LocalDate.of(1942, 5, 21), 81);
        Human human_10 = new Human(27, "Олег", "Маямов", LocalDate.of(1995, 9, 3), 63);


        list.add(human_1);
        list.add(human_2);
        list.add(human_3);
        list.add(human_4);
        list.add(human_5);
        list.add(human_6);
        list.add(human_7);
        list.add(human_8);
        list.add(human_9);
        list.add(human_10);


        System.out.print("\nСортировка по имени в обратном порядке:\n");
        Stream<Human> sortedList = list.stream();
        sortedList.sorted(Comparator.comparing(Human::getFirstName)
                .reversed())
                .forEach(System.out::println);



        System.out.print("\nФильтрация по возрасту больше, чем 20:\n");
        Stream<Human> sortAge = list.stream();
        sortAge.filter(a -> a.getAge() > 20)
                .forEach(System.out::println);



        System.out.print("\nВыбор первых 3 элементов списка:\n");
        Stream<Human> getFT = list.stream();
        getFT.limit(3)
                .forEach(System.out::println);



        System.out.print("\nКонкатенация имен в строку через пробел:\n");
        Stream<Human> conNames = list.stream();
        String result = conNames.map(human -> human.getFirstName()).collect(Collectors.joining(" "));
        System.out.print(result);
    }
}
