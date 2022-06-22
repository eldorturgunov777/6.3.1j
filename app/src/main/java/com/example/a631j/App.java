package com.example.a631j;

import android.app.Application;

import androidx.room.Room;

import com.example.a631j.database.AppDatabase;

/**
 * Created by Eldor Turgunov on 22.06.2022.
 * 6.3.1j
 * eldorturgunov777@gmail.com
 */
public class App extends Application {

    public static App instance;
    private AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appDatabase = Room.databaseBuilder(this, AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }
    public static App getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return appDatabase;
    }
}
