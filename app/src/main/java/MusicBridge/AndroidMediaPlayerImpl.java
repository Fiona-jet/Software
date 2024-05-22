package MusicBridge;

// AndroidMediaPlayerImpl.java


import android.content.Context;
import android.media.MediaPlayer;
import android.provider.Settings;

/**
 * Implementation of MediaPlayerImpl for Android platform.
 */

public class AndroidMediaPlayerImpl implements MediaPlayerImpl {
    private MediaPlayer mediaPlayer;
    private Context context;

    /**
     * Constructs an AndroidMediaPlayerImpl object.
     *
     * @param context The Android context.
     */

    public AndroidMediaPlayerImpl(Context context) {
        this.context = context;
    }
    /**
     * Starts playing the default alarm alert sound.
     *
     * @return Always returns null.
     */
    @Override
    public junit.framework.TestResult start() {

        mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaPlayer.start();
        return null;
    }

    /**
     * Stops the MediaPlayer and releases its resources.
     */

    @Override
    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}