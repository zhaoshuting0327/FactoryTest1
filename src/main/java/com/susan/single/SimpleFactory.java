package com.susan.single;

/**
 * Created by Administrator on 2017/11/30.
 */
public class SimpleFactory  {

    public   Fruits getFruit(String fruit) throws Exception {
        if(fruit.equals("apple"))
        {
            return  new Apple();
        }else if (fruit.equals("bananer"))
        {
            return new Bananer();
        }else
        {
            throw new Exception("出错喽！！！");
        }
    }


}
