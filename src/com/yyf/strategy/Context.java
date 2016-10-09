package com.yyf.strategy;

/**
 * Created by yuyunfeng on 2016/10/9.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }

    private char t = '你';
}
