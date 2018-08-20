package com.xueyou.demo.serviceImpl;

import com.xueyou.demo.annotation.Provider;

@Provider("service2")
public class CalServiceImpl2 extends DefaultCalServiceImpl{
    @Override
    public void say() {
        System.out.println(this);
        System.out.println("this is " + this.getClass().getName());
    }
}
