package com.demo.util;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description:
 * @Author: wub
 * @Date: 2021/1/15 11:29
 */
public class DateUtil {

    private static final ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    private static final DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public synchronized static Date getDate(String dateStr) {
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static LocalDateTime getDate1(String dateStr) {
        return LocalDateTime.parse(dateStr, df);
    }

    public static Date getDate2(String dateStr) {
        Date parse = null;
        try {
            parse = threadLocal.get().parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return parse;
    }
}
