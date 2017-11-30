package com.susan.single;

/**
 * Created by Administrator on 2017/11/30.
 */
public class MainTest {

    public static void main(String[] args) throws Exception {

        SimpleFactory simpleFactory=new SimpleFactory();

        simpleFactory.getFruit("apple");

        simpleFactory.getFruit("bananer");
    }
}
