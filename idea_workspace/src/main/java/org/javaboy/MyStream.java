package org.javaboy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pxh
 *
 * SteamAPI 针对集合或数组进行操作
 * 关注的是做什么，而不是怎么做
 */
public class MyStream {
    public static void main(String[] args) {
        //传统模式
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("hello");
        list.add("stream");

        long count = 0;
        for (String s: list) {
            if(s.length()>3){
                count++;
            }
        }
        System.out.println(count);

        //流式方法
        //s -> s.length() > 3  ---labmda表达式
        //1.链式编程
        //2.函数接口
        //3.lambda表达式
        long count1 = list.stream().filter(s -> s.length() > 3).count();
        System.out.println(count1);
    }
}
