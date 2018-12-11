package com.pattern;

/**
 * 安装车身
 */
public class BodyHandler extends CarHandler{
    @Override
    public void task() {
        System.out.println("安装车身");
        if(carHandler != null){
            carHandler.task();
        }
    }
}
