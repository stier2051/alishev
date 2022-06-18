package Collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
//        for(int i = 0; i < 100000; i++) {
//            list.add(i);
//        }

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
