public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your player:");
        System.out.println("1: Aang");
        System.out.println("2: SpongeBob");
        System.out.println("3: Michelangelo");

        int choice = Input.getUserInt("Choose your player (enter a number)");
        Player p1 = new Player("Aang");
        Player p2 = new Player("SpongeBob");
        Player p3 = new Player("Michelangelo");
        Player p4 = new Player("Hnas");



        if (choice == 1) {
            p1 = new HumanPlayer("Aang");
        }else if (choice == 2) {
            p2 = new HumanPlayer("SpongeBob");
        }else if (choice == 3) {
            p3 = new HumanPlayer("Michelangelo");
        }






        Game game = new Game();
        game.registerPlayer(p1);
        game.registerPlayer(p2);
        game.registerPlayer(p3);
        game.registerPlayer(p4);

        game.run();

    }
}
