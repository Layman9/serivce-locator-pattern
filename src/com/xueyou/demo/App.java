package com.xueyou.demo;

import com.xueyou.demo.locator.CalServiceLocator2;
import com.xueyou.demo.service.CalService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CalServiceLocator2 serviceLocator2 = CalServiceLocator2.getInstance();
        serviceLocator2.showCache();
        serviceLocator2.init();
        serviceLocator2.showCache();
        CalService calService = serviceLocator2.getService("service1");
        calService.say();
        CalService calService1 = serviceLocator2.getService("service2");
        calService1.say();
    }
}
