package BehavioralPattern.Iterator;

import java.util.Comparator;

/**
 * Created by root on 16-12-23.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        student s1 = (student)o1;
        student s2 = (student)o2;
        if (s1.getAge() < s2.getAge()){
            return 1;
        }else {
            return 0;
        }
    }
}
