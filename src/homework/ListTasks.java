package homework;

import java.util.*;
import java.util.stream.Collectors;

public class ListTasks {

    public static void printList(List list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static Integer getThirdElement(List list) {
        if (list.size() < 3) {
            throw new IndexOutOfBoundsException("Меньше 3 элементов");
        }
        return (Integer) list.get(2);
    }

    public static List removeSecondElement(List list) {
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

    public static int countSevens(List list) {
        int count = 0;
        for (Object obj : list) {
            if (((Integer) obj) == 7) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains42(List list) {
        return list.contains(42);
    }

    public static int[] minMax(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Пустой список");
        }
        int min = (Integer) list.get(0);
        int max = (Integer) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int val = (Integer) list.get(i);
            if (val < min) {
                min = val;
            } else if (val > max) {
                max = val;
            }
        }
        return new int[]{min, max};
    }

    public static List removeEven(List list) {
        List result = new ArrayList();
        for (Object obj : list) {
            int val = (Integer) obj;
            if (val % 2 != 0) {
                result.add(val);
            }
        }
        return result;
    }

    public static List fromArray(int[] arr) {
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static int countGreaterThan(List list, int n) {
        int count = 0;
        for (Object obj : list) {
            int val = (Integer) obj;
            if (val > n) {
                count++;
            }
        }
        return count;
    }

    public static List filterLongStrings(List list) {
        List result = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (str.length() > 5) {
                result.add(str);
            }
        }
        return result;
    }

    public static List invertList(List list) {
        List inverted = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) {
            inverted.add(list.get(i));
        }
        return inverted;
    }

    public static List unionNoDuplicates(List list1, List list2) {
        Set set = new LinkedHashSet();
        set.addAll(list1);
        set.addAll(list2);
        return new ArrayList(set);
    }

    public static int sumOdd(List list) {
        int sum = 0;
        for (Object obj : list) {
            int val = (Integer) obj;
            if (val % 2 != 0) {
                sum += val;
            }
        }
        return sum;
    }

    public static List filterByFirstLetterA(List list) {
        List result = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (str.startsWith("А")) {
                result.add(str);
            }
        }
        return result;
    }
}