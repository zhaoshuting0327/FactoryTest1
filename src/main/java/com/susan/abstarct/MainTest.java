package com.susan.abstarct;

import com.susan.method.Fruit;

/**
 * Created by Administrator on 2017/11/30.
 */
public class MainTest {

    public static void main(String[] args) {

        Fruit1Factory fruit1Factory=new Fruit1Factory();

        fruit1Factory.createApple();
        fruit1Factory.createBananer();
    }
}
