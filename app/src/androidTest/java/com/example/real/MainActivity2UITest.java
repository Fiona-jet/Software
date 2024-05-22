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

/**
 * The MainActivity2UITest class contains UI tests for MainActivity2 using Espresso.
 * It verifies the visibility of specific UI components such as toolbar, drawer layout, and bottom navigation view.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivity2UITest {
    /**
     * Launches the MainActivity2 before each test method.
     */

    @Before
    public void launchActivity() {
        // Launch the
        ActivityScenario.launch(MainActivity2.class);
    }

    /**
     * Test case for verifying if the toolbar is displayed.
     */
    @Test
    public void testToolbarDisplayed() {
        // Check if the toolbar is displayed
        Espresso.onView(withId(R.id.toolbar)).check(matches(isDisplayed()));
    }
    /**
     * Test case for verifying if the drawer layout is displayed.
     */
    @Test
    public void testDrawerLayoutDisplayed() {
        // Check if the drawer layout is displayed
        Espresso.onView(withId(R.id.drawerlayout)).check(matches(isDisplayed()));
    }

    /**
     * Test case for verifying if the bottom navigation view is displayed.
     */

    @Test
    public void testBottomNavigationViewDisplayed() {
        // Check if the bottom navigation view is displayed
        Espresso.onView(withId(R.id.bnview)).check(matches(isDisplayed()));
    }


}