package com.alextheedom.patterns.strategyenum.enumstrategy;

/**
 * Created by Developer on 05/04/2015.
 */
public enum Strategy {

    STRATEGY_A{
        @Override
        public void execute(){
            System.out.print("Executing strategy A");
        }
    },
    STRATEGY_B{
        @Override
        public void execute(){
            System.out.print("Executing strategy B");
        }
    };

    public abstract void execute();
}
