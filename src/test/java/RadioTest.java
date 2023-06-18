import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void RadioTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void RadioTestNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void RadioTestNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test

    public void RadioTestPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void RadioTestVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
