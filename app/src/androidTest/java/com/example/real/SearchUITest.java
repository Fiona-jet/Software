package com.example.real;

import static androidx.test.espresso.action.ViewActions.click;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SearchUITest {

    @Rule
    public ActivityScenarioRule<Search> activityScenarioRule = new ActivityScenarioRule<>(Search.class);

    @Before
    public void setUp() {
        // Initialize Intents before each test
        Intents.init();
    }

    @After
    public void tearDown() {
        // Release Intents after each test
        Intents.release();
    }

    @Test
    public void testButtonClick() {
        // Click on the button
        Espresso.onView(ViewMatchers.withId(R.id.button_insomnia)).perform(click());

        // Verify that the intent to start MediUseage activity was sent
        Intents.intended(IntentMatchers.hasComponent(MediUseage.class.getName()));
    }
}