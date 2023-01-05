public class Radio {
    public int currentStationNumber;
    public int currentVolume;

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

    public void nextStation(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 9 && newCurrentStationNumber >= 0) {
            currentStationNumber = newCurrentStationNumber + 1;}
            else {
                currentStationNumber = 0;
            }
        }

    public void previousStation(int newCurrentStationNumber) {
        if (newCurrentStationNumber <= 9 && newCurrentStationNumber > 0) {
            currentStationNumber = newCurrentStationNumber - 1;
        }
        else {
            currentStationNumber = 9;
        }
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = 10;
        }

    }


    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 1) {
            currentVolume = newCurrentVolume - 1;
        }
    }
}


