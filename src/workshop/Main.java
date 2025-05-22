package workshop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<String> names = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        list.add(1, 5);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.contains(10));

        ProArrayList proList = new ProArrayList();
        System.out.println(proList);

        proList.add("Привет");
        proList.add("Мир");
        proList.add("!");
        System.out.println(proList);

        for (int i = 0; i < 100; i++) {
            proList.add("index" + i);
        }

        System.out.println(proList);

        System.out.println(proList.get(0));
        System.out.println(proList.get(proList.size() - 1));

        proList.add(proList.size(), "Конец списка");
        System.out.println(proList);
    }
}