package ru.netology.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void CurrentRadioStationAn1() {
        Radio rad = new Radio();

        rad.nextChangeStation(8);

        int expected = 9;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationAn3() {
        Radio rad = new Radio();

        rad.nextChangeStation(9);

        int expected = 0;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationAn4() {
        Radio rad = new Radio();

        rad.nextChangeStation(10);

        int expected = 0;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationAn2() {
        Radio rad = new Radio();

        rad.prevChangeStation(-1);

        int expected = 9;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationAn5() {
        Radio rad = new Radio();

        rad.prevChangeStation(1);

        int expected = 0;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void CurrentRadioStationAn6() {
//        Radio rad = new Radio();
//
//        rad.prevChangeStation(-1);
//
//        int expected = 9;
//        int actual = rad.radioStationNumber;
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void SoundVolume() {
        Radio rad = new Radio();

        rad.plusIncreaseVolume(9);

        int expected = 10;
        int actual = rad.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume2() {
        Radio rad = new Radio();

        rad.plusIncreaseVolume(11);

        int expected = 10;
        int actual = rad.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume3() {
        Radio rad = new Radio();

        rad.minusIncreaseVolume(-1);

        int expected = 0;
        int actual = rad.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume4() {
        Radio rad = new Radio();

        rad.minusIncreaseVolume(3);

        int expected = 2;
        int actual = rad.soundVolume;

        Assertions.assertEquals(expected, actual);
    }
}
