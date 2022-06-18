package Collect;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            list.add(i);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Integer x : list) {
            System.out.println(x);
        }
    }
}
