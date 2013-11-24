package com.eg.dashclock.episodereminder;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class UpdateEpisodeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        int episodeNumber = sp.getInt(EpisodeReminderService.EPISODE_NUMBER, 1);

        sp.edit().putInt(EpisodeReminderService.EPISODE_NUMBER, episodeNumber + 1).apply();

        Toast.makeText(this, "Updated: " + sp.getInt(EpisodeReminderService.EPISODE_NUMBER, 1), Toast.LENGTH_LONG).show();

        finish();
    }
}
