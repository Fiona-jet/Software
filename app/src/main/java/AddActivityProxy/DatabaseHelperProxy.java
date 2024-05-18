package AddActivityProxy;

import android.content.Context;
import android.util.Log;

import com.example.real.Alarm;
import com.example.real.DatabaseHelper;

public class DatabaseHelperProxy {
    private DatabaseHelper databaseHelper;

    public DatabaseHelperProxy(Context context) {
        this.databaseHelper = new DatabaseHelper(context);
    }

    public void addAlarm(Alarm alarm) {
        // Add additional logic before adding an alarm
        // Example: Validate the alarm before adding to the database
        if (validateAlarm(alarm)) {
            databaseHelper.addAlarm(alarm);
        } else {
            // Log an error or handle the validation failure
            Log.e("DatabaseHelperProxy", "Validation failed: Invalid alarm data");
        }
    }

    private boolean validateAlarm(Alarm alarm) {
        // Implement validation logic, e.g., check for null values or valid times
        if (alarm.getName() == null || alarm.getName().isEmpty()) {
            return false;
        }
        // Add additional validation rules as needed
        return true;
    }
}

