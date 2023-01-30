package ru.netology.object;

public class Radio {
    public int radioStationNumber;
    public int soundVolume;

    public void nextChangeStation(int newChangeStation) {
        if (newChangeStation < 9) {
            radioStationNumber = newChangeStation + 1;
        }
        if (newChangeStation > 9) {
            radioStationNumber = 0;
        }
    }

    public void prevChangeStation(int newChangeStation) {
        if (newChangeStation < 0) {
            radioStationNumber = 9;
        }
        if (newChangeStation > 0) {
            radioStationNumber = newChangeStation - 1;
        }
    }

    public void plusIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 10) {
            soundVolume = newIncreaseVolume + 1;
        }
        if (newIncreaseVolume > 10) {
            soundVolume = 10;
        }
    }

    public void minusIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 0) {
            soundVolume = 0;
        }
        if (newIncreaseVolume > 0) {
            soundVolume = newIncreaseVolume - 1;
        }
    }
}
