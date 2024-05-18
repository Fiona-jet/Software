package AlarmReceiverFly;

import java.util.HashMap;
import java.util.Map;

public class AlarmStateFactory {
    private static final Map<String, AlarmState> states = new HashMap<>();

    public static AlarmState getAlarmState(String state) {
        AlarmState alarmState = states.get(state);
        if (alarmState == null) {
            alarmState = new AlarmState(state);
            states.put(state, alarmState);
        }
        return alarmState;
    }

    // Nested class to represent the state
    public static class AlarmState {
        private final String state;

        public AlarmState(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
