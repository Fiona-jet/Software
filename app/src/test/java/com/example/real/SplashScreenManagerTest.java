package com.example.real;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * This class contains unit tests for the {@link SplashScreenManager} class.
 * It verifies the default delay time and the ability to set a new delay time.
 */
public class SplashScreenManagerTest {
    /**
     * Tests that the default delay time of the SplashScreenManager is 3500 milliseconds.
     */

    @Test
    public void testDelayTimeDefaultValue() {
        SplashScreenManager manager = SplashScreenManager.getInstance();
        assertEquals(3500, manager.getDelayTime());
    }
    /**
     * Tests that the delay time can be set to a new value in the SplashScreenManager.
     * This test sets the delay time to 5000 milliseconds and verifies the change.
     */


    @Test
    public void testSetDelayTime() {
        SplashScreenManager manager = SplashScreenManager.getInstance();
        long newDelayTime = 5000;
        manager.setDelayTime(newDelayTime);
        assertEquals(newDelayTime, manager.getDelayTime());
    }
}
