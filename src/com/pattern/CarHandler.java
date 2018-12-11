package com.pattern;

/**
 * 汽车类
 */
public abstract class CarHandler {
    protected CarHandler carHandler;

    public  CarHandler setChaimHandler(CarHandler carHandler){
        this.carHandler = carHandler;
        return carHandler;
    }
    public abstract void task();
}
