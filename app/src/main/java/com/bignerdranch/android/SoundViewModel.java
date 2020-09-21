package com.bignerdranch.android;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
  private Sound mSound;
  private BeatBox mBeatBox;

  public SoundViewModel(BeatBox beatbox) {
    mBeatBox = beatbox;
  }

  @Bindable
  public String getTitle() {
    return mSound.getmName();
  }

  public Sound getSound() {
    return mSound;
  }

  public void setSound(Sound sound) {
    mSound = sound;
    notifyChange();
  }
}
