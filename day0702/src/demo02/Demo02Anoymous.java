package demo02;

import java.util.Scanner;

public class Demo02Anoymous {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //匿名对象的方式
        //int num = new Scanner(System.in).nextInt();

        //使用一般写法传参
       // Scanner sc = new Scanner(System.in);
        //methodParam(sc);

        //使用匿名对象来进行传参
        methodParam(new Scanner(System.in));

    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }
}
