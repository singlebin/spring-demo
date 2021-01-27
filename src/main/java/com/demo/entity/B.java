package com.demo.entity;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/7 17:21
 */
public class B {

    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public B() {
        System.out.println("B 创建成功 =======");
    }
}
