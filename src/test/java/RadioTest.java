import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetCurrentVolume.csv")
    public void shouldSetCurrentVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetCurrentStationNumber.csv")
    public void shouldSetCurrentStation(int currentStation, int expected) {
        Radio radio = new Radio(20);
        radio.setCurrentStationNumber(currentStation);
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/NextStation.csv")
    public void shouldGoNextStation(int newCurrentStationNumber, int expected) {
        Radio radio = new Radio(67);
        radio.setCurrentStationNumber(newCurrentStationNumber);
        radio.nextStation();
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/previousStation.csv")
    public void shouldGoPreviousStation(int newCurrentStationNumber, int expected) {
        Radio radio = new Radio(35);
        radio.setCurrentStationNumber(newCurrentStationNumber);
        radio.previousStation();
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncreaseVolume.csv")
    public void shouldIncreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void shouldDecreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}