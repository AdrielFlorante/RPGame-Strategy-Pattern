public class GameApp {
    public static void main(String[] args) {
        Character knight = new Knight();
        Character wizard = new Wizard();

        knight.attack();
        knight.defend();

        wizard.attack();
        wizard.defend();
    }
}
