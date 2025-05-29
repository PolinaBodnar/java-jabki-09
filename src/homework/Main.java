package homework;

import homework.ListTasks;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Вывести список из 5 чисел
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 7, 7, 42));
        System.out.print("Список: ");
        ListTasks.printList(list);

        // 2. Вывести третий элемент
        System.out.println("Третий элемент: " + ListTasks.getThirdElement(list));

        // 3. Удалить второй элемент и вывести
        ListTasks.removeSecondElement(list);
        System.out.print("После удаления второго элемента: ");
        ListTasks.printList(list);

        // 4. Сумма всех чисел
        System.out.println("Сумма: " + ListTasks.sumList(list));

        // 5. Кол-во семерок
        System.out.println("Количество семерок: " + ListTasks.countSevens(list));

        System.out.println("Количество 7 (нет): " + ListTasks.countSevens(Arrays.asList(1, 2, 3)));

        // 6. Проверка наличия 42
        System.out.println("Содержит 42? " + ListTasks.contains42(list));

        // 7. Минимум и максимум
        int[] mm = ListTasks.minMax(list);
        System.out.println("Мин: " + mm[0] + ", Макс: " + mm[1]);

        List<Integer> oneItemList = Arrays.asList(99);
        System.out.println("Мин/Макс одного элемента: " + Arrays.toString(ListTasks.minMax(oneItemList)));

        // 8. Удалить все четные
        list = ListTasks.removeEven(list);
        System.out.print("После удаления четных: ");
        ListTasks.printList(list);

        // 9. Создать из массива
        int[] arr = {1, 2, 3, 4};
        List<Integer> fromArr = ListTasks.fromArray(arr);
        System.out.print("Список из массива: ");
        ListTasks.printList(fromArr);

        // 10. Кол-во элементов > N
        System.out.println("Элементов > 2: " + ListTasks.countGreaterThan(fromArr, 2));

        // 11. Фильтрация строк по длине >5
        List<String> strings = Arrays.asList("Привет", "Java", "Коллекции", "Список", "Мир");
        System.out.println("Строки длиннее 5: " + ListTasks.filterLongStrings(strings));

        // 12. Инвертировать список
        System.out.println("Инвертированный список: " + ListTasks.invertList(fromArr));

        List<Object> empty = new ArrayList<>();
        System.out.println("Инвертированный пустой список: " + ListTasks.invertList(empty));


        // 13. Объединение без дубликатов
        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2 = Arrays.asList(3,4,5);
        System.out.println("Объединение без дубликатов: " + ListTasks.unionNoDuplicates(l1,l2));

        // 14. Сумма нечётных чисел
        System.out.println("Сумма нечётных: " + ListTasks.sumOdd(fromArr));

        // 15. Фильтр по первой букве "А"
        List<String> rusStrings = Arrays.asList("Апельсин", "Банан", "Автобус", "Арбуз", "Машина");
        System.out.println("Строки, начинающиеся на 'А': " + ListTasks.filterByFirstLetterA(rusStrings));

        List<String> mixedCase = Arrays.asList("арбуз", "Арфа", "Аптека", "алгебра", "Атлас");
        System.out.println("Строки с 'А': " + ListTasks.filterByFirstLetterA(mixedCase));
    }
}
