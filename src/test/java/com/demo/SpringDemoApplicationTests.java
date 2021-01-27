package com.demo;

import com.demo.entity.A;
import com.demo.entity.B;
import com.demo.service.FuntionInterface;
import com.demo.util.DateUtil;
import com.demo.util.NumUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class SpringDemoApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object a = applicationContext.getBean("a", A.class);
        Object b = applicationContext.getBean("b", B.class);
    }

    @Test
    void test() {
//        String a = "hello";
//        String b = "world";
//
//        System.out.printf("i can spank %s and %s \n", a, b);
//
//        ArrayList<String> list = new ArrayList<String>() {{
//            addAll(Collections.singletonList("1"));
//        }};
//        System.out.println("list = " + list);
//
//        List<String> stringList = Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());
//        System.out.println("stringList = " + stringList);

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("1");
        String s = threadLocal.get();
        System.out.println("s = " + s);
    }

    // 测试threadLocal
    @Test
    void test1(){
        ExecutorService service = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            service.execute(()->{
                System.out.println(DateUtil.getDate2("2019-06-01 16:34:30"));
            });
        }
        service.shutdown();
    }

    @Test
    void test2() {
//        ExecutorService executorService = Executors.newFixedThreadPool(20);
//
//        for (int i = 0; i < 20; i++) {
//            int num = i;
//            executorService.execute(() -> {
//                System.out.println(num + " " +  NumUtil.getAdd(num));
//            });
//        }
//        executorService.shutdown();


    }

}
