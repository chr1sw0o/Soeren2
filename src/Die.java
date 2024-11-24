import java.util.Random;

public class Die {
    private int number;

    public int getNumber() {
        return number;
    }
    public void roll() {
        number = (int) (Math.random() * 6) + 1;
    }
    @Override
    public String toString() {
        return Integer.toString(number);
    }
}