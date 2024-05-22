package MusicBridge;

// AndroidMediaPlayerImpl.java


import android.content.Context;
import android.media.MediaPlayer;
import android.provider.Settings;

public class AndroidMediaPlayerImpl implements MediaPlayerImpl {
    private MediaPlayer mediaPlayer;
    private Context context;

    public AndroidMediaPlayerImpl(Context context) {
        this.context = context;
    }

    @Override
    public junit.framework.TestResult start() {

        mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mediaPlayer.start();
        return null;
    }

    @Override
    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}