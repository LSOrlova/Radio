public class Radio {
    private int maxStation;
    private int currentStationNumber;
    private int currentVolume;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsQuantity) {
        maxStation = stationsQuantity - 1;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxStation) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int nextStation() {
        if (currentStationNumber == maxStation) {
            currentStationNumber = 0;
        } else {
            int plusStation = currentStationNumber + 1;
            currentStationNumber = plusStation;
        }
        return currentStationNumber;
    }

    public int previousStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = maxStation;
        } else {
            int minusStation = currentStationNumber - 1;
            currentStationNumber = minusStation;
        }
        return currentStationNumber;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        int minusVolume = currentVolume - 1;
        setCurrentVolume(minusVolume);
    }
}


