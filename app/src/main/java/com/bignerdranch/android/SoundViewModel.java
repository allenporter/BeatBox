package com.bignerdranch.android;

public class SoundViewModel {
  private Sound mSound;
  private BeatBox mBeatBox;

  public SoundViewModel(BeatBox beatbox) {
    mBeatBox = beatbox;
  }

  public String getTitle() {
    return mSound.getmName();
  }

  public Sound getSound() {
    return mSound;
  }

  public void setSound(Sound sound) {
    mSound = sound;
  }
}
