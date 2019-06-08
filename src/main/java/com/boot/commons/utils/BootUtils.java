package com.boot.commons.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: LiuHeYong
 * @create: 2019-05-22
 * @description: BootUtils
 **/
public class BootUtils {

    /**
     * 锁对象
     */
    private static final Object lockObj = new Object();

    private static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>(4);

    private static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    /**
     * @description: 多线程下获取线程安全的SimpleDateFormat
     */
    private static SimpleDateFormat getSdf(final String pattern) {
        ThreadLocal<SimpleDateFormat> tl = sdfMap.get(pattern);
        // 此处的双重判断和同步是为了防止sdfMap这个单例被多次put重复的sdf
        if (tl == null) {
            synchronized (lockObj) {
                tl = sdfMap.get(pattern);
                if (tl == null) {
                    // 这里是关键,使用ThreadLocal<SimpleDateFormat>替代原来直接new SimpleDateFormat
                    tl = new ThreadLocal<SimpleDateFormat>() {
                        @Override
                        protected SimpleDateFormat initialValue() {
                            return new SimpleDateFormat(pattern);
                        }
                    };
                    sdfMap.put(pattern, tl);
                }
            }
        }

        return tl.get();
    }

    public static String sdfFormat(Date date, String pattern) throws ParseException {
        return getSdf(pattern).format(date);
    }

    public static Date sdfParse(String strDate, String pattern) throws ParseException {
        return getSdf(pattern).parse(strDate);
    }

    /**
     * @date: 2019/5/31
     * @param: len
     * @return: String
     * @exception:
     * @description: 生成指定长度的随机字符串(区分大小写)
     */
    public static String generateRandomChar(Integer len) {
        StringBuffer sb = new StringBuffer();
        for (Integer i = 0; i < len; i = i + 1) {
            int intRand = (int) (Math.random() * 52.0D);
            char base = (char) (intRand < 26 ? 65 : 97);
            char c = (char) (base + intRand % 26);
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * @date: 2019/5/31
     * @param: len
     * @return: String
     * @exception:
     * @description: 生成指定长度包含字符和数字的随机字符串(区分大小写)
     */
    public static String generateRandomCharAndNumber(Integer len) {
        StringBuffer sb = new StringBuffer();
        for (Integer i = 0; i < len; i = i + 1) {
            int intRand = (int) (Math.random() * 52.0D);
            int numValue = (int) (Math.random() * 10.0D);
            char base = (char) (intRand < 26 ? 65 : 97);
            char c = (char) (base + intRand % 26);
            if (numValue % 2 == 0) {
                sb.append(c);
            } else {
                sb.append(numValue);
            }
        }
        return sb.toString();
    }

    /**
     * @date: 2019/5/31
     * @param: len
     * @return: String
     * @exception:
     * @description: 生成6为随机数字
     */
    public static int getSixNum() {
        return (int) ((Math.random() * 9.0D + 1.0D) * 100000.0D);
    }

}
