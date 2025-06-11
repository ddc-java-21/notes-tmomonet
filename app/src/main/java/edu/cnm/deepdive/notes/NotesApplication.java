package edu.cnm.deepdive.notes;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class NotesApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
  }
}
