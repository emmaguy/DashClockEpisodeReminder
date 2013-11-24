package com.eg.dashclock.episodereminder;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.google.android.apps.dashclock.api.DashClockExtension;

public class EpisodeReminderService extends DashClockExtension {

    private static final String EPISODE_NUMBER = "episodeNumber";

    @Override
    protected void onUpdateData(int i) {

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        int episodeNumber = sp.getInt(EPISODE_NUMBER, 1);

        Toast.makeText(this, "update: " + episodeNumber, Toast.LENGTH_LONG).show();
    }
}
