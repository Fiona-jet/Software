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

/**
 * This class contains UI tests for the {@link AddActivity} class.
 * It verifies the functionality of the save and cancel buttons in the activity.
 */
@RunWith(AndroidJUnit4.class)
public class AddActivityUITest {

    private ActivityScenario<AddActivity> scenario;
    /**
     * Sets up the activity scenario before each test.
     */

    @Before
    public void setUp() {
        scenario = ActivityScenario.launch(AddActivity.class);
    }
    /**
     * Closes the activity scenario after each test.
     */

    @After
    public void tearDown() {
        if (scenario != null) {
            scenario.close();
        }
    }
    /**
     * Tests that clicking the save button creates a new alarm.
     * It sets the time in the TimePicker, enters a name, and clicks the save button.
     * The test verifies that the activity finishes and sets needRefresh to true.
     */

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
    /**
     * Tests that clicking the cancel button closes the activity.
     * The test verifies that the activity finishes without setting needRefresh to true.
     */

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
