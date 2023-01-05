import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetCurrentVolume.csv")
    public void shouldSetCurrentVolume(int currentVolume, int expected) {
        Radio cond = new Radio();
        cond.setCurrentVolume(currentVolume);
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetCurrentStationNumber.csv")
    public void shouldSetCurrentStation(int currentStation, int expected) {
        Radio cond = new Radio();
        cond.setCurrentStationNumber(currentStation);
        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/NextStation.csv")
    public void shouldGoNextStation(int currentStationNumber, int expected) {
        Radio cond = new Radio();
        cond.nextStation(currentStationNumber);
        int actual = cond.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/previousStation.csv")
    public void shouldGoPreviousStation(int currentStationNumber, int expected) {
        Radio cond = new Radio();
        cond.previousStation(currentStationNumber);
        int actual = cond.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncreaseVolume.csv")
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio cond = new Radio();
        cond.increaseVolume(currentVolume);
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio cond = new Radio();
        cond.decreaseVolume(currentVolume);
        int actual = cond.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}