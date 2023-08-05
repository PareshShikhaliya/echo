package class12;

import java.util.Scanner;

class CricketPlayer {
    private String playerName;
    private int playerAge;
    private String playerRole;

    public CricketPlayer(String playerName, int playerAge, String playerRole) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerRole = playerRole;
    }

    // Getters and setters (not shown for brevity)

    @Override
    public String toString() {
        return "Player Name: " + playerName + ", Age: " + playerAge + ", Role: " + playerRole;
    }
}

public class CricketManagementSystem2 {
    private static final int MAX_PLAYERS = 11;
    private String teamName;
    private CricketPlayer[] players;
    private int numPlayers;

    public CricketManagementSystem2(String teamName) {
        this.teamName = teamName;
        players = new CricketPlayer[MAX_PLAYERS];
        numPlayers = 0;
    }

    public void addPlayer(CricketPlayer player) {
        if (numPlayers < MAX_PLAYERS) {
            players[numPlayers] = player;
            numPlayers++;
            System.out.println("Player added to the team!");
        } else {
            System.out.println("Sorry, the team already has 11 players.");
        }
    }

    public void displayTeam() {
        System.out.println("Cricket Team: " + teamName);
        for (int i = 0; i < numPlayers; i++) {
            System.out.println(players[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Team Name: ");
        String teamName = scanner.nextLine();
        CricketManagementSystem2 cricketManagement = new CricketManagementSystem2(teamName);

        while (true) {
            System.out.println("\nCricket Team Management System");
            System.out.println("1. Add Player to the Team");
            System.out.println("2. Display Team");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter Player Name: ");
                String playerName = scanner.nextLine();
                System.out.print("Enter Player Age: ");
                int playerAge = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Player Role: ");
                String playerRole = scanner.nextLine();
                CricketPlayer newPlayer = new CricketPlayer(playerName, playerAge, playerRole);
                cricketManagement.addPlayer(newPlayer);
            } else if (choice == 2) {
                cricketManagement.displayTeam();
            } else if (choice == 3) {
                System.out.println("Exiting the program.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
