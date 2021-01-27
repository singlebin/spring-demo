package com.demo.util;

import com.demo.service.IService;

import java.util.ServiceLoader;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/20 10:22
 */
public class Test {

    public static void main(String[] args) {
        ServiceLoader<IService> loader = ServiceLoader.load(IService.class);
        for (IService service : loader) {
            service.doSomeThing();
        }
    }
}
