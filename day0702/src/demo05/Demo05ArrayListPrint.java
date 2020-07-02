package demo05;

import java.util.ArrayList;

public class Demo05ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("弗兰奇");
        list.add("甚平");
        list.add("鹰眼");
        list.add("女帝");
        System.out.println(list);//[弗兰奇, 甚平, 鹰眼, 女帝]

        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1){
                System.out.println(name + "}");
            }
            else{
                System.out.print(name + "@");//{弗兰奇@甚平@鹰眼@女帝}
            }

        }
    }
}
