package org.example.Radio;

public class Radio {

    public int currentStation;
    public int currentVolume;

    public int minStation = 0;
    public int maxStation = 9;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int commonAmount;

    public Radio(){
        commonAmount = 9;
    }

    public Radio(int commonAmount) {
        this.commonAmount = commonAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation() {
        if (currentStation < minStation) {
            return minStation;
        }
        if (currentStation > maxStation) {
            return maxStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public void switchToNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void switchToPreviousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}

