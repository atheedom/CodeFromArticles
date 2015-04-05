package com.alextheedom.patterns.strategyenum.classicstrategypattern;

/**
 * Created by Developer on 05/04/2015.
 */
public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.execute();
    }
}
