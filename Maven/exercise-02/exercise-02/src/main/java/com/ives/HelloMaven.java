package com.ives;

public class HelloMaven {
    public int addNumber(int n1,int n2){
        return n1+n2;
    }

    public static void main(String args[]){
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.addNumber(10,20);
        System.out.println("res = "+res);
    }
}
