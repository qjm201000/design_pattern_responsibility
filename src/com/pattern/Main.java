package com.pattern;

public class Main {
    public static void main(String[] args) {
        CarHandler headerHandler = new HeaderHandler();//车头
        CarHandler bodyHandler = new BodyHandler();//车身
        CarHandler footerHandler = new FooterHandler();//车尾

        headerHandler.setChaimHandler(bodyHandler).setChaimHandler(footerHandler);
        headerHandler.task();//拼装车
    }
}
