package BehavioralPattern.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by root on 16-12-23.
 */
public class MyClass {
    private ArrayList<student> students = new ArrayList<student>();
    public void addStu(student stu){
        students.add(stu);
    }
    public void display(){
        Comparator comparator = new MyComparator();
        Collections.sort(students,comparator);
        Iterator i = students.iterator();
        while (i.hasNext()){
            student stu = (student)i.next();
            System.out.println("name :"+ stu.getName()+"  sex:"+stu.getSex()+"    age:"+stu.getAge());
        }
    }
}
