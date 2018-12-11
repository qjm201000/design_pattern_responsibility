package com.pattern;

/**
 * 安装车尾
 */
public class FooterHandler extends CarHandler{
    @Override
    public void task() {
        System.out.println("安装车尾");
        if(carHandler != null){
            carHandler.task();
        }
    }
}
