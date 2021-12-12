package be.intecbrussel.abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.calculate();
        womenGameCalculator.gameOver();

        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.calculate();
        manGameCalculator.gameOver();

        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.calculate();

        GameCalculator gameCalculator2 = new OlderGameCalculator();
        gameCalculator2.calculate();
    }
}
