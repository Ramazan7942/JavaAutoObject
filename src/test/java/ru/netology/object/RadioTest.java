package ru.netology.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void CurrentRadioStationTest1() {
        Radio rad = new Radio();

        rad.setRadNum(6);
        rad.nextChangeStation();

        int expected = 7;
        int actual = rad.getRadNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationTest2() {
        Radio rad = new Radio();

        rad.setRadNum(9);
        rad.nextChangeStation();

        int expected = 0;
        int actual = rad.getRadNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationTest3() {
        Radio rad = new Radio();

        rad.setRadNum(10);
        rad.nextChangeStation();

        int expected = 1;
        int actual = rad.getRadNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationTest4() {
        Radio rad = new Radio();

        rad.setRadNum(0);
        rad.prevChangeStation();

        int actual = rad.getRadNum();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationTest5() {
        Radio rad = new Radio();

        rad.setRadNum(-1);
        rad.prevChangeStation();

        int actual = rad.getRadNum();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationTest6() {
        Radio rad = new Radio();

        rad.setRadNum(1);
        rad.prevChangeStation();

        int expected = 0;
        int actual = rad.getRadNum();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void SoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(9);
        rad.plusIncreaseVolume();

        int expected = 10;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume2() {
        Radio rad = new Radio();

        rad.setSoundVolume(12);
        rad.plusIncreaseVolume();

        int expected = 10;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume3() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);
        rad.minusIncreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume4() {
        Radio rad = new Radio();

        rad.setSoundVolume(0);
        rad.minusIncreaseVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolume5() {
        Radio rad = new Radio();

        rad.setSoundVolume(3);
        rad.minusIncreaseVolume();

        int expected = 2;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
