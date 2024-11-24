import java.util.Random;

public class Die {
    public static Random rand = new Random();
    public static int roll() {
        return rand.nextInt(6) + 1;
    }
}