package com.demo.service.impl;

import com.demo.service.IService;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/20 10:20
 */
public class DefalutService implements IService {

    @Override
    public void doSomeThing() {
        System.out.println("默认服务！" );
    }
}
