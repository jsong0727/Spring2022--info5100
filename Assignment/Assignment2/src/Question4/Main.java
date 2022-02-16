package Question4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jamie", 500);
        Player player2 = new Player("Bob", 200);
        Player player3 = new Player("Charlie", 300);
        Player player4 = new Player("David", 300);
        Player player5 = new Player("Eason", 800);

        Player[] players = {player1, player2, player3, player4, player5};
        Compare compare = new Compare();
        Arrays.sort(players, compare);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].name + ": " + players[i].score);


        }
    }


}
