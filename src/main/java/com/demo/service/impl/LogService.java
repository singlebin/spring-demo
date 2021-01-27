package com.demo.service.impl;

import com.demo.service.IService;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/20 10:21
 */
public class LogService implements IService {
    @Override
    public void doSomeThing() {
        System.out.println("日志服务！" );
    }
}
