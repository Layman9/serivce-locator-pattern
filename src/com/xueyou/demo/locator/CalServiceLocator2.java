
package com.xueyou.demo.locator;

import com.xueyou.demo.service.CalService;
import com.xueyou.demo.serviceImpl.CalServiceImpl1;
import com.xueyou.demo.serviceImpl.CalServiceImpl2;
import com.xueyou.demo.serviceImpl.DefaultCalServiceImpl;
import java.util.HashMap;
import java.util.Map;

public class CalServiceLocator2 {
    private static CalServiceLocator2 calServiceLocator2;
    private static Map<String, CalService> map = new HashMap<>();

    private CalServiceLocator2() {
    }

    public static CalServiceLocator2 getInstance() {
        if (calServiceLocator2 != null) {
            return calServiceLocator2;
        }
        calServiceLocator2 = new CalServiceLocator2();
        return calServiceLocator2;
    }

    public void register(String code, CalService calService) {
        if (!map.containsKey(code)) {
            map.put(code, calService);
        }
    }

    public CalService getService(String code) {
        if (map.containsKey(code)) {
            return map.get(code);
        }
        return null;
    }

    public void showCache() {
        System.out.println("cache 情况 --begin");
        for (String s : map.keySet()) {
            System.out.println(s + ":" + map.get(s));
        }
        System.out.println("cache 情况 --end");
    }

    public void init(){
        new DefaultCalServiceImpl();
        new CalServiceImpl1();
        new CalServiceImpl2();
        System.out.println("service init ......");
    }
}

