package ru.job4j.tracker.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> listofnum = List.of(1, 2, 3, 4, 5, 6 ,7);
        List<String> listofstr = List.of("one", "two", "three", "four", "five", "six", "seven");
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (num, str) -> map.put(num, str);
        for (int i = 0; i < listofstr.size() - 1; i++) {
            biCon.accept(listofnum.get(i), listofstr.get(i));
            System.out.println(listofnum.get(i) + " is " + listofstr.get(i));
        }
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPred = (num, str) -> num % 2 == 0 || str.length() == 4;
        for (Integer i : map.keySet()) {
            System.out.println(biPred.test(i, map.get(i)));
        }

        Supplier<List<String>> sup = () -> (List<String>) map.values();
        List<String> strings = new ArrayList<>(map.values());
        Consumer<String> con = (str) -> System.out.println(str);
        Function<String, String> func = (str) -> str.toUpperCase();
        for (String str : strings) {
            con.accept(func.apply(str));
        }

    }

}