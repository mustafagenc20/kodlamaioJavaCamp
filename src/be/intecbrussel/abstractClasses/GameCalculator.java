package be.intecbrussel.abstractClasses;

public abstract class GameCalculator {
    public abstract void calculate();

    public void gameOver(){
        System.out.println("Game Over!");
    }
}
