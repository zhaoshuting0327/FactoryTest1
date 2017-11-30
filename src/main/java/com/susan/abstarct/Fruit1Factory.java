package com.susan.abstarct;

/**
 * Created by Administrator on 2017/11/30.
 */
public class Fruit1Factory implements Factory {


    public Apple createApple() {
        return new Apple1();
    }

    public Bananer createBananer() {
        return new Bananer1();
}
}
