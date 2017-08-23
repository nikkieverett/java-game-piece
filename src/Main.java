public class Main {

    public static void main(String[] args) {
        GamePiece warrior = new GamePiece("Howard the Barbarian", "Green");

        warrior.move(2,5);
        warrior.freeze();
        warrior.move(1, 2);
        warrior.unfreeze();
    }
}
