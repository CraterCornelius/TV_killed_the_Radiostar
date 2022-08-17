package org.example.Radio;

public class Radio {

    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation() {
        if (currentStation < 0) {
            return 0;
        }
        if (currentStation > 9) {
            return 9;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public void switchToNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void switchToPreviousStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

