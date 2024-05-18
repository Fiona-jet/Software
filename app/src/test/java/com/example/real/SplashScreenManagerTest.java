package com.example.real;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplashScreenManagerTest {

    @Test
    public void testDelayTimeDefaultValue() {
        SplashScreenManager manager = SplashScreenManager.getInstance();
        assertEquals(3500, manager.getDelayTime());
    }

    @Test
    public void testSetDelayTime() {
        SplashScreenManager manager = SplashScreenManager.getInstance();
        long newDelayTime = 5000;
        manager.setDelayTime(newDelayTime);
        assertEquals(newDelayTime, manager.getDelayTime());
    }
}
