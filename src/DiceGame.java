import java.util.Scanner;
import java.util.ArrayList;

public class DiceGame {
    static final Scanner input = new Scanner(System.in);
    public static ArrayList<Die> dice;
    public static void main(String[] args)
    {
        DiceGame game = new DiceGame();
        game.playRound(dice);
    }

    public void playRound(ArrayList<Die> dice)
    {
        System.out.println("Indtast størrelsen på ArrayList");
        int size = input.nextInt();
        dice = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
        {
            dice.add(new Die());
        }
        rollAllDice(dice);
        System.out.println();
        sumDice(dice);
        averageRoll(dice);
        System.out.println("Vil du spille igen? 'ja' eller 'nej'");
        String replay = input.next();
        if (replay.equals("ja")) {
            playRound(dice);
        } else if (replay.equals("nej")) {
            System.out.println("Tak, for du spillede med!");
            System.exit(0);
        } else {
            System.out.println("Ugyldigt input, programmet lukker");
            System.exit(0);
        }
    }

    public static void printDice(ArrayList<Die> dice)
    {
        System.out.println("Terningerne er kastet:");
        for (int i = 0; i < dice.size(); i++) {
            dice.get(i).roll();
            System.out.print(dice.get(i) + " ");
        }
    }

    public static int sumDice(ArrayList<Die> dice)
    {
        int sum = 0;
        for (Die number : dice) {
            sum += number.getNumber();
        }
        System.out.println("Summen af terningerne er: " + sum);
        return sum;
    }

    public static double averageRoll(ArrayList<Die> dice)
    {
        int sum = 0;
        for (Die number : dice) {
            sum += number.getNumber();
        }
        double average = (double) sum / dice.size();
        System.out.println("Gennemsnittet af terningerne er: " + average);
        return average;
    }

    public static void rollAllDice(ArrayList<Die> dice)
    {
        printDice(dice);
    }
}

