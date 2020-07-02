package demo04;

import java.util.ArrayList;

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(100);
        listA.add(200);
        System.out.println(listA);//[100,200]

        int num = listA.get(1);
        System.out.println("第1号元素是：" + num);
    }
}
