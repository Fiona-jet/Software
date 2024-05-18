package com.example.real;

public class SplashScreenManager {

    private static final SplashScreenManager instance = new SplashScreenManager();
    // Default delay time
    private long delayTime = 3500;

    // Private constructor to prevent instantiation
    private SplashScreenManager() {}

    // Public method to access the singleton instance
    public static SplashScreenManager getInstance() {
        return instance;
    }

    // Getter for delay time
    public long getDelayTime() {
        return delayTime;
    }

    // Setter for delay time, in case you want to change it dynamically
    public void setDelayTime(long delayTime) {
        this.delayTime = delayTime;
    }


}
