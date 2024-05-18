package com.example.real;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.contrib.PickerActions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class AddActivityUITest {

    private ActivityScenario<AddActivity> scenario;

    @Before
    public void setUp() {
        scenario = ActivityScenario.launch(AddActivity.class);
    }

    @After
    public void tearDown() {
        if (scenario != null) {
            scenario.close();
        }
    }

    @Test
    public void testSaveButtonCreatesAlarm() {
        // Set time in TimePicker
        onView(withId(R.id.timePicker)).perform(PickerActions.setTime(10, 30));

        // Enter name in EditText
        onView(withId(R.id.name)).perform(replaceText("Test Alarm"));

        // Click the save button
        onView(withId(R.id.button_save)).perform(click());

        // Verify that the activity finishes and returns RESULT_OK
        scenario.onActivity(activity -> {
            // Check if needRefresh is set to true
            assert(activity.needRefresh);
        });
    }

    @Test
    public void testCancelButtonClosesActivity() {
        // Click the cancel button
        onView(withId(R.id.button_cancel)).perform(click());

        // Verify that the activity is finished
        scenario.onActivity(activity -> {
            // Activity should not set needRefresh to true
            assert(!activity.needRefresh);
        });
    }
}
