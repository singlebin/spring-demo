package com.demo.entity;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/7 17:21
 */
public class A {

    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public A() {
        System.out.println("A 创建成功 =========");
    }
}
