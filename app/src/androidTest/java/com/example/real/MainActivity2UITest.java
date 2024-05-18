package com.example.real;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivity2UITest {

    @Before
    public void launchActivity() {
        // Launch the
        ActivityScenario.launch(MainActivity2.class);
    }

    @Test
    public void testToolbarDisplayed() {
        // Check if the toolbar is displayed
        Espresso.onView(withId(R.id.toolbar)).check(matches(isDisplayed()));
    }

    @Test
    public void testDrawerLayoutDisplayed() {
        // Check if the drawer layout is displayed
        Espresso.onView(withId(R.id.drawerlayout)).check(matches(isDisplayed()));
    }



    @Test
    public void testBottomNavigationViewDisplayed() {
        // Check if the bottom navigation view is displayed
        Espresso.onView(withId(R.id.bnview)).check(matches(isDisplayed()));
    }


}