package com.demo.util;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/15 17:02
 */
public class VolatileTest3 {

    static class Work {
        boolean isShutdown = false;

        void shutdown () {
            isShutdown = true;
            System.out.println("shutdown");
        }

        void doWork () {
            while (!isShutdown) {
                System.out.println("doWork");
            }

        }

    }

    public static void main(String[] args) {
        Work work = new Work();


        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::shutdown).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();
        new Thread(work::doWork).start();

    }
}
