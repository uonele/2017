package BehavioralPattern.Iterator;

/**
 * Created by uonele on 2016/12/14.
 */
public class Client {
    public static void main(String[] args){
    MyClass myClass = new MyClass();
    student s1,s2,s3;
    s1 = new student("uonele","man",16);
    s2 = new student("litao","man",12);
    myClass.addStu(s1);
    myClass.addStu(s2);
    myClass.display();
    }
}
