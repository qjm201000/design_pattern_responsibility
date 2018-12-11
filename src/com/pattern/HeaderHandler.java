package com.pattern;

/**
 * 安装车头
 */
public class HeaderHandler extends CarHandler{
    @Override
    public void task() {
        System.out.println("安装车头！");
        if(carHandler != null){
            carHandler.task();
        }
    }
}
