package org.example.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void getCurrentStation() {
        Radio radio = new Radio();
        radio.currentStation = 7;

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.currentStation = 7;

        int expected = 7;
        int actual = radio.setCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void doNotSetAboveMin() {
        Radio radio = new Radio();
        radio.currentStation = -1;

        int expected = 0;
        int actual = radio.setCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNotSetBelowMax() {
        Radio radio = new Radio();
        radio.currentStation = 11;

        int expected = 9;
        int actual = radio.setCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToNextStation() {
        Radio radio = new Radio();
        radio.currentStation = 7;
        radio.switchToNextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchAboveMaxToLoop() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.switchToNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPreviousStation() {
        Radio radio = new Radio();
        radio.currentStation = 7;
        radio.switchToPreviousStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchBelowMinToLoop() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.switchToPreviousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.volumeUp();

        int expected = 8;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNotGoAboveMax() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.volumeUp();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        radio.currentVolume = 7;
        radio.volumeDown();

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNotGoBelowMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.volumeDown();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}