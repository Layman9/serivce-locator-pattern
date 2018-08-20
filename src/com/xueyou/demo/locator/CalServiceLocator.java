
package com.xueyou.demo.locator;

import com.xueyou.demo.service.CalService;
import com.xueyou.demo.serviceImpl.CalServiceImpl1;
import com.xueyou.demo.serviceImpl.CalServiceImpl2;

public class CalServiceLocator {
    private static CalServiceLocator calServiceLocator;

    private CalServiceLocator() {
    }

    public static CalServiceLocator getInstance() {
        if (calServiceLocator != null) {
            return calServiceLocator;
        }
        return new CalServiceLocator();
    }

    public CalService getService(String serviceName) {
        CalService calService;
        if (serviceName.equals("serviceImpl1")) {
            calService = new CalServiceImpl1();
        } else if (serviceName.equals("serviceImpl2")) {
            calService = new CalServiceImpl2();
        } else {
            calService = null;
        }
        return calService;
    }
}

