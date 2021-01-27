package com.demo.util;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/15 16:17
 */
public class NumUtil {

    public static int addNum = 0;

    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public static int getSum(int a) {
        addNum = a;
        try {
            TimeUnit.MICROSECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return addNum + 10;
    }

    public static int getAdd(int a) {
        threadLocal.set(a);
        try {
            TimeUnit.MICROSECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return threadLocal.get() + 10;
    }
}
