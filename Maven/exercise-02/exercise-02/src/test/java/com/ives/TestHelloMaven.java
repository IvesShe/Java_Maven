package com.ives;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAddNumber1(){
        System.out.println("testAddNumber1");
        HelloMaven hello = new HelloMaven();
        int res = hello.addNumber(10,20);
        Assert.assertEquals(30,res);
    }

    @Test
    public void testAddNumber2(){
        System.out.println("testAddNumber2");
        HelloMaven hello = new HelloMaven();
        int res = hello.addNumber(50,100);
        Assert.assertEquals(150,res);
    }
}
