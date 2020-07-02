package demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加元素：add
        boolean success = list.add("路飞");
        System.out.println(list);//[路飞]
        System.out.println("添加的动作是否成功：" + success);//true

        list.add("萨博");
        list.add("艾斯");
        list.add("索隆");
        list.add("山治");
        System.out.println(list);//[路飞, 萨博, 艾斯, 索隆, 山治]

        //从集合中获取元素：get 索引值从0开始
        String name = list.get(1);
        System.out.println("第1号索引位置" + name);//萨博

        //从集合中删除元素：remove 索引值从0开始
        String whoRemoved = list.remove(2);
        System.out.println("死掉的人是：" + whoRemoved);//艾斯
        System.out.println(list);//[路飞, 萨博, 索隆, 山治]

        //获取集合的尺寸长度，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是："+ size) ;//4
    }
}
