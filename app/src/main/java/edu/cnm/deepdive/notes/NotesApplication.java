package edu.cnm.deepdive.notes;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;
import edu.cnm.deepdive.notes.service.dao.NoteDao;
import io.reactivex.rxjava3.schedulers.Schedulers;
import javax.inject.Inject;

@HiltAndroidApp
public class NotesApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
  }
}

