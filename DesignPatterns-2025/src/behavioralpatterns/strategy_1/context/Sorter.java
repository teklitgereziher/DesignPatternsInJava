package behavioralpatterns.strategy_1.context;

import behavioralpatterns.strategy_1.strategyinterface.Sorting;

/**
 * The context class maintains a reference to a strategy object and
 * interacts with it through a common interface.
 */
public class Sorter {
    private Sorting strategy;

    public Sorter(Sorting strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void sortNumbers(int[] numbers) {
        strategy.sort(numbers);
    }
}
