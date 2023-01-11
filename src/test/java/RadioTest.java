import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetCurrentVolume.csv")
    public void shouldSetCurrentVolume(int currentVolume, int expected) {
        Radio cond = new Radio(stationsQuantity);
        cond.setCurrentVolume(currentVolume);
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SetCurrentStationNumber.csv")
    public void shouldSetCurrentStation(int currentStation, int expected) {
        Radio cond = new Radio(stationsQuantity);
        cond.setCurrentStationNumber(currentStation);
        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/NextStation.csv")
    public void shouldGoNextStation(int newCurrentStationNumber, int expected) {
        Radio cond = new Radio(stationsQuantity);
        cond.setCurrentStationNumber(newCurrentStationNumber);
        cond.nextStation();
        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/previousStation.csv")
    public void shouldGoPreviousStation(int newCurrentStationNumber, int expected) {
        Radio cond = new Radio(stationsQuantity);
        cond.setCurrentStationNumber(newCurrentStationNumber);
        cond.previousStation();
        int actual = cond.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncreaseVolume.csv")
    public void shouldIncreaseVolume(int newCurrentVolume, int expected) {
        Radio cond = new Radio(stationsQuantity);
        cond.setCurrentVolume(newCurrentVolume);
        cond.increaseVolume();
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void shouldDecreaseVolume(int newCurrentVolume, int expected) {
        Radio cond = new Radio(stationsQuantity);
        cond.setCurrentVolume(newCurrentVolume);
        cond.decreaseVolume();
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}