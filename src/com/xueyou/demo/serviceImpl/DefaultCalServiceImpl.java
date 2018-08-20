
package com.xueyou.demo.serviceImpl;

import com.xueyou.demo.annotation.Provider;
import com.xueyou.demo.locator.CalServiceLocator2;
import com.xueyou.demo.service.CalService;

@Provider("default")
public class DefaultCalServiceImpl implements CalService {
    public DefaultCalServiceImpl() {
        Provider provider = this.getClass().getAnnotation(Provider.class);
        String code = provider.value();
        CalServiceLocator2.getInstance().register(code, this);
    }

    @Override
    public void say() {
        System.out.println(this);
        System.out.println("this is " + this.getClass().getName());
    }
}

