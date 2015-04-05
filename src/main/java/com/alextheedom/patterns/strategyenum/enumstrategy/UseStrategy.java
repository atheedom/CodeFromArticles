package com.alextheedom.patterns.strategyenum.enumstrategy;

/**
 * Created by Developer on 05/04/2015.
 */
public class UseStrategy {

    public static void main(String[] args){
        UseStrategy useStrategy = new UseStrategy();
        useStrategy.perform(Strategy.STRATEGY_A);
        useStrategy.perform(Strategy.STRATEGY_B);
    }

    private void perform(Strategy strategy){
        strategy.execute();
    }
}
