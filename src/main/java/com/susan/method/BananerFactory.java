package com.susan.method;

/**
 * Created by Administrator on 2017/11/30.
 */
public class BananerFactory implements Factory {
    public Fruit create() {
        return new Bananer();
    }
}
