package ru.netology.object;

public class Radio {

    private int radio;
    private int soundVolume;

    public int getRadNum() {

        return radio;
    }

    public void setRadNum(int radio) {
        if (radio < 0) {
            return;
        }
        if (radio > 9) {
            return;
        }

        this.radio = radio;
    }

    public void nextChangeStation() {
        if (radio < 9) {
            radio = radio + 1;
        } else
            radio = 0;
    }

    public void prevChangeStation() {
        if (radio <= 0) {
            radio = 9;
        } else
            radio = radio - 1;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            soundVolume = 10;
        }
        this.soundVolume = soundVolume;
    }

    public void plusIncreaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
    }

    public void minusIncreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}