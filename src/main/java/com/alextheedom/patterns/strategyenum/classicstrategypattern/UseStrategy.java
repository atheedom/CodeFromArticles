package com.alextheedom.patterns.strategyenum.classicstrategypattern;

/**
 * Created by Developer on 05/04/2015.
 */
public class UseStrategy {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new StrategyA());
        context.executeStrategy();

        context.setStrategy(new StrategyB());
        context.executeStrategy();
    }
}
