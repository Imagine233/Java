package demo05;

import java.util.ArrayList;

public class Demo05ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("罗宾",22);
        Student two = new Student("娜美",21);
        Student three = new Student("乌索普",20);
        Student four = new Student("乔巴",19);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄"+ stu.getAge());

        }
    }




}
