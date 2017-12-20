package com.service.glfdev.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestGlfdev {

        GlfdevDelegate glfdevDelegate = new GlfdevDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = glfdevDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}