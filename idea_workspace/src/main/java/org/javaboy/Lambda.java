package org.javaboy;

import java.util.Comparator;
import java.util.TreeSet;

public class Lambda {
    public static void main(String[] args) {
        //正常写法
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("running");
            }
        };
        new Thread(runnable).start();
        //lambda函数写法
        Runnable runnable1 = ()->{System.out.println("hello,lambda");};
        new Thread(runnable1).start();
        //合体版
        new Thread(()->{System.out.println("hello,lambda2");}).start();
        //只有一步操作时{}可以省略
        new Thread(()->System.out.println("hello,lambda2")).start();

        //传统的模式
        Comparator<String> stringComparable = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        TreeSet<String> treeSet = new TreeSet<>(stringComparable);

        //labmda
        Comparator<String> comparator = ((o1, o2) ->o1.length()-o2.length());
        TreeSet<String> treeSet1 = new TreeSet<>(comparator);

        //升级简洁版
        TreeSet<String> treeSet2 = new TreeSet<>((o1,o2)->o1.length()-o2.length());
    }
}
