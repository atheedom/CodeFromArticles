package com.alextheedom.patterns.strategyenum.classicstrategypattern;

/**
 * Created by Developer on 05/04/2015.
 */
public class StrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.print("Executing strategy B");
    }
}
