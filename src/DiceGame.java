import java.util.Scanner;

public class DiceGame {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }
        DiceGame dicegame = new DiceGame();
        dicegame.playRound(dice);
    }
    public void playRound(Die[] dice)
    {
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

    public static void printDice(Die[] dice)
    {
        System.out.println("Terningerne er kastet:");
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
            System.out.print(dice[i].getNumber() + " ");

        }
    }

    public static int sumDice(Die[] dice)
    {
        int sum = 0;
        for (Die number : dice) {
            sum += number.getNumber();
        }
        System.out.println("Summen af terningerne er: " + sum);
        return sum;
    }

    public static double averageRoll(Die[] dice)
    {
        int average = 0;
        for (Die number : dice) {
            average += number.getNumber();
        }
        System.out.println("Gennemsnittet af terningerne er: " + average);
        return (double) average / dice.length;
    }

    public static void rollAllDice(Die[] dice)
    {
        printDice(dice);
    }
}

