package novi.basics;

import java.util.Scanner;

public class Main {

    public static final Scanner PLAYERINPUT = new Scanner(System.in);

    public static void main(String[] args) {
        boolean resetPlayers = true;
        while (resetPlayers) {
            // de 1e speler om zijn naam vragen
            System.out.println("What is your name?");
            // de naam van de 1e speler opslaan
            String playerName = PLAYERINPUT.next();
            Player player = new Player(playerName);

            boolean rematch = true;
            while (rematch) {
                Game game = new Game(player, 5);
                game.play();

                // vragen of de spelers nog een keer willen spelen
                System.out.println("What do you want to do next?");
                //1: nog een keer spelen
                System.out.println("1: Play again");
                //2: van spelers wisselen
                System.out.println("2: Change Player");
                //3: afsluiten
                System.out.println("3: Exit");

                // speler keuze opslaan
                int choice = PLAYERINPUT.nextInt();
                switch (choice) {
                    case 2: rematch = false;
                        break;

                    case 3: rematch = false;
                        resetPlayers = false;
                        break;
                }
            }
        }
    }
}