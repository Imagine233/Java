package demo04;

import java.util.ArrayList;

public class Demo04ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        //右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String > list = new ArrayList<>();
        System.out.println(list);//[]

        list.add("宋智孝");
        System.out.println(list);//[宋智孝]

        list.add("谢可寅");
        list.add("虞书欣");
        list.add("许佳琪");
        System.out.println(list);//[宋智孝, 谢可寅, 虞书欣, 许佳琪]
    }

}
