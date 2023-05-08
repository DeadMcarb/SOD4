package org.example;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < 0 && o2 > 0) return 1;
        if (o1 > 0 && o2 < 0) return -1;
        if (o1 < 0) {
            return -Integer.compare(o1, o2);
        }else return Integer.compare(o1, o2);
    }

}
