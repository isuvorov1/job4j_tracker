package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemWithoutNull = new Item[items.length];
        int size = 0;
        for (Item itemCount : items) {
            if (itemCount != null) {
                itemWithoutNull[size] = itemCount;
                size++;
            }
        }
        itemWithoutNull = Arrays.copyOf(itemWithoutNull, size);
        return itemWithoutNull;
    }


    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int size = 0;
        for (Item itemCount : items) {
                if (itemCount != null && itemCount.getName().equals(key)) {
                    rsl[size] = itemCount;
                    size++;
                }
            }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }
}