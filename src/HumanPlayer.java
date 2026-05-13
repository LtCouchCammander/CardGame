import java.util.ArrayList;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Player chooseTarget(ArrayList<Player> players) {
        int count = 1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i) != this) {
                System.out.println(count + ": " + players.get(i).getName());
                count++;
            }

        }
    int choice = Input.getUserInt("Choose a target (enter a number)");
        int count2 = 1;
        for(int i =0; i < players.size(); i++) {
            if (players.get(i) != this) {
                if (count2 == choice) {
                    return players.get(i);
                }
                count2++;
            }
        }
        return null;
    }








}