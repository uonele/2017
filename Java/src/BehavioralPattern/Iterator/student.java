package BehavioralPattern.Iterator;

/**
 * Created by root on 16-12-23.
 */
public class student {
    private String name;
    private String sex;
    private int age;
    public student(String name , String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
