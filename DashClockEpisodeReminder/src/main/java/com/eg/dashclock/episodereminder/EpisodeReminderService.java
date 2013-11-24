package com.eg.dashclock.episodereminder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;

public class EpisodeReminderService extends DashClockExtension {

    public static final String EPISODE_NUMBER = "episodeNumber";

    @Override
    protected void onUpdateData(int i) {

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        int episodeNumber = sp.getInt(EPISODE_NUMBER, 1);

        Intent clickIntent = new Intent(this, UpdateEpisodeActivity.class);
        publishUpdate(new ExtensionData()
                .visible(true)
                .icon(R.drawable.ic_launcher)
                .status("" + episodeNumber)
                .clickIntent(clickIntent));
    }
}
