package homework;

import java.util.*;
import java.util.stream.Collectors;

public class ListTasks {

    // Вывести список из 5 чисел через пробел
    public static void printList(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Вывести третий элемент списка
    public static Integer getThirdElement(List<Integer> list) {
        if (list.size() < 3) {
            throw new IndexOutOfBoundsException("Меньше 3 элементов");
        }
        return list.get(2);
    }

    // Удалить второй элемент списка и вывести оставшиеся
    public static List<Integer> removeSecondElement(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        list.remove(1);
        return list;
    }

    // Найти сумму всех чисел в списке
    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) sum += num;
        return sum;
    }

    // Подсчитать сколько раз встречается число 7
    public static int countSevens(List<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num == 7) count++;
        }
        return count;
    }

    // Проверить, содержится ли число 42
    public static boolean contains42(List<Integer> list) {
        return list.contains(42);
    }

    // Найти минимум и максимум
    public static int[] minMax(List<Integer> list) {
        if (list.isEmpty()) throw new NoSuchElementException("Пустой список");
        int min = Collections.min(list);
        int max = Collections.max(list);
        return new int[]{min, max};
    }

    // Удалить все четные числа
    public static List<Integer> removeEven(List<Integer> list) {
        return list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }

    // Создать список из массива
    public static List<Integer> fromArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int n : arr) list.add(n);
        return list;
    }

    // Количество элементов > N
    public static int countGreaterThan(List<Integer> list, int n) {
        int count = 0;
        for (int item : list) {
            if (item > n) {
                count++;
            }
        }
        return count;
    }

    // Создать список строк и вывести строки длиннее 5
    public static List<String> filterLongStrings(List<String> list) {
        return list.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
    }

    // Инвертировать список
    public static <T> List<T> invertList(List<T> list) {
        List<T> inverted = new ArrayList<>(list);
        Collections.reverse(inverted);
        return inverted;
    }

    // Объединить два списка без дубликатов
    public static <T> List<T> unionNoDuplicates(List<T> list1, List<T> list2) {
        Set<T> set = new LinkedHashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    // Сумма только нечётных чисел
    public static int sumOdd(List<Integer> list) {
        int sum = 0;
        for (int n : list) {
            if (n % 2 != 0) sum += n;
        }
        return sum;
    }

    // Фильтр по первой букве "А"
    public static List<String> filterByFirstLetterA(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("А"))
                .collect(Collectors.toList());
    }
}
