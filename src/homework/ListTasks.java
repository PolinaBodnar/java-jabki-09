package homework;

import java.util.*;

public class ListTasks {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static Integer getThirdElement(List<Integer> list) {
        if (list.size() < 3) {
            throw new IndexOutOfBoundsException("Меньше 3 элементов");
        }
        return list.get(2);
    }

    public static List<Integer> removeSecondElement(List<Integer> list) {
        if (list.size() >= 2) {
            list.remove(1);
        }
        return list;
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static int countSevens(List<Integer> list) {
        int count = 0;
        for (int val : list) {
            if (val == 7) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains42(List<Integer> list) {
        return list.contains(42);
    }

    public static int[] minMax(List<Integer> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Пустой список");
        }
        int min = list.get(0);
        int max = list.get(0);
        for (int val : list) {
            if (val < min) {
                min = val;
            } else if (val > max) {
                max = val;
            }
        }
        return new int[]{min, max};
    }

    public static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (val % 2 != 0) {
                result.add(val);
            }
        }
        return result;
    }

    public static List<Integer> fromArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    public static int countGreaterThan(List<Integer> list, int n) {
        int count = 0;
        for (int val : list) {
            if (val > n) {
                count++;
            }
        }
        return count;
    }

    public static List<String> filterLongStrings(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (str.length() > 5) {
                result.add(str);
            }
        }
        return result;
    }

    public static List<?> invertList(List<?> list) {
        List<Object> inverted = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            inverted.add(list.get(i));
        }
        return inverted;
    }

    public static List<?> unionNoDuplicates(List<?> list1, List<?> list2) {
        Set<Object> set = new LinkedHashSet<>();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }

    public static int sumOdd(List<Integer> list) {
        int sum = 0;
        for (int val : list) {
            if (val % 2 != 0) {
                sum += val;
            }
        }
        return sum;
    }

    public static List<String> filterByFirstLetterA(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (str.startsWith("А")) {
                result.add(str);
            }
        }
        return result;
    }
}
