package com.example.real;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * The AlarmTest class contains unit tests for the Alarm class.
 * It verifies the functionality of the Alarm class methods.
 */
public class AlarmTest {

    /**
     * Test case for verifying the constructor of the Alarm class.
     * It checks if the constructor correctly initializes the alarm with given parameters.
     */
    @Test
    public void testAlarmConstructor() {
        Alarm alarm = new Alarm(8, 30, true, "Morning Alarm");
        assertEquals(8, alarm.getHour());
        assertEquals(30, alarm.getMinute());
        assertTrue(alarm.getStatus());
        assertEquals("Morning Alarm", alarm.getName());
    }

    /**
     * Test case for verifying the setHour() method of the Alarm class.
     * It checks if the setHour() method correctly sets the hour of the alarm.
     */
    @Test
    public void testSetHour() {
        Alarm alarm = new Alarm();
        alarm.setHour(7);
        assertEquals(7, alarm.getHour());
    }

    /**
     * Test case for verifying the setMinute() method of the Alarm class.
     * It checks if the setMinute() method correctly sets the minute of the alarm.
     */
    @Test
    public void testSetMinute() {
        Alarm alarm = new Alarm();
        alarm.setMinute(45);
        assertEquals(45, alarm.getMinute());
    }

    /**
     * Test case for verifying the setStatus() method of the Alarm class.
     * It checks if the setStatus() method correctly sets the status of the alarm.
     */
    @Test
    public void testSetStatus() {
        Alarm alarm = new Alarm();
        alarm.setStatus(false);
        assertFalse(alarm.getStatus());
    }
    /**
     * Test case for verifying the setName() method of the Alarm class.
     * It checks if the setName() method correctly sets the name of the alarm.
     */
    @Test
    public void testSetName() {
        Alarm alarm = new Alarm();
        alarm.setName("Evening Alarm");
        assertEquals("Evening Alarm", alarm.getName());
    }

    /**
     * Test case for verifying the toString() method of the Alarm class.
     * It checks if the toString() method correctly generates a string representation of the alarm time.
     */
    @Test
    public void testToString() {
        // Test for AM format
        Alarm amAlarm = new Alarm(9, 15, true, "Morning Alarm");
        assertEquals("9:15 AM", amAlarm.toString());

        // Test for PM format
        Alarm pmAlarm = new Alarm(15, 30, true, "Afternoon Alarm");
        assertEquals("3:30 PM", pmAlarm.toString());

        // Test for noon
        Alarm noonAlarm = new Alarm(12, 0, true, "Noon Alarm");
        assertEquals("12:00 PM", noonAlarm.toString());

        // Test for midnight
        Alarm midnightAlarm = new Alarm(0, 0, true, "Midnight Alarm");
        assertEquals("12:00 AM", midnightAlarm.toString());
    }
}
