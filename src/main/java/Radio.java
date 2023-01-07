public class Radio {
    private int currentStationNumber;
    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int nextStation() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            int plusStation = currentStationNumber + 1;
            currentStationNumber = plusStation;
        }
        return currentStationNumber;
    }

    public int previousStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            int minusStation = currentStationNumber - 1;
            currentStationNumber = minusStation;
        }
        return currentStationNumber;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        int minusVolume = currentVolume - 1;
        setCurrentVolume(minusVolume);
    }
}


