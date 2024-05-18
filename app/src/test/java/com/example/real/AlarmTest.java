package com.example.real;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlarmTest {

    @Test
    public void testAlarmConstructor() {
        Alarm alarm = new Alarm(8, 30, true, "Morning Alarm");
        assertEquals(8, alarm.getHour());
        assertEquals(30, alarm.getMinute());
        assertTrue(alarm.getStatus());
        assertEquals("Morning Alarm", alarm.getName());
    }

    @Test
    public void testSetHour() {
        Alarm alarm = new Alarm();
        alarm.setHour(7);
        assertEquals(7, alarm.getHour());
    }

    @Test
    public void testSetMinute() {
        Alarm alarm = new Alarm();
        alarm.setMinute(45);
        assertEquals(45, alarm.getMinute());
    }

    @Test
    public void testSetStatus() {
        Alarm alarm = new Alarm();
        alarm.setStatus(false);
        assertFalse(alarm.getStatus());
    }

    @Test
    public void testSetName() {
        Alarm alarm = new Alarm();
        alarm.setName("Evening Alarm");
        assertEquals("Evening Alarm", alarm.getName());
    }

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
