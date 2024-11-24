import java.util.Scanner;

public class DiceGame {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int[] dice = new int[5];
        DiceGame dicegame = new DiceGame();
        dicegame.playRound(dice);

    }
    public void playRound(int[] dice) {

        rollAllDice(dice);
        System.out.println();
        sumDice(dice);
        averageRoll(dice);
        System.out.println("Vil du spille igen? 'ja' eller 'nej'");
        String replay = input.nextLine();
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

    public static void printDice(int[] dice)
    {
        System.out.println("Terningerne er kastet:");
        for (int i = 0; i < dice.length; i++) {
            dice[i] = Die.roll();
            System.out.print(dice[i] + " ");

        }
    }

    public static int sumDice(int[] dice)
    {
        int sum = 0;
        for (int number : dice) {
            sum += number;
        }
        System.out.println("Summen af terningerne er: " + sum);
        return sum;
    }

    public static double averageRoll(int[] dice)
    {
        int average = 0;
        for (int number : dice) {
            average += number;
        }
        System.out.println("Gennemsnittet af terningerne er: " + average);
        return (double) average / dice.length;
    }

    public static void rollAllDice(int[] dice)
    {
        Die.roll();
        printDice(dice);
    }
}

