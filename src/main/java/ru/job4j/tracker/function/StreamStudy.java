package ru.job4j.tracker.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudy {
    public static void main(String[] args) {
        ArrayList<Integer> intarray = new ArrayList<>();
        intarray.add(1);
        intarray.add(4);
        intarray.add(-1);
        intarray.add(-21);
        intarray.add(-111);
        intarray.add(14);
        intarray.add(13);
        intarray.add(122);
        intarray.add(144);
        intarray.add(-1333);

        List<Integer> rsl = intarray.stream().filter(s -> s > 0).collect(Collectors.toList());
        System.out.println(rsl);
    }
}
