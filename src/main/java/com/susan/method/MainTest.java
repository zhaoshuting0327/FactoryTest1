package com.susan.method;

/**
 * Created by Administrator on 2017/11/30.
 */
public class MainTest {

    public static void main(String[] args) {

        AppleCreate appleCreate=new AppleCreate();

        appleCreate.create();

        BananerFactory bananerFactory=new BananerFactory();

        bananerFactory.create();
    }
}
