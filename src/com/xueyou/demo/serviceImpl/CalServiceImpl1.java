
package com.xueyou.demo.serviceImpl;

import com.xueyou.demo.annotation.Provider;

@Provider(value = "service1")
public class CalServiceImpl1 extends DefaultCalServiceImpl {

    @Override
    public void say() {
        System.out.println(this);
        System.out.println("this is " + this.getClass().getName());
    }
}

