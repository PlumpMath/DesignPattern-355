package com.yyf.strategy;

/**
 * Created by yuyunfeng on 2016/10/9.
 */
public class FirstMethod implements Strategy{

    @Override
    public void operate() {
        System.out.printf("这是第一种方法！");
    }
}
