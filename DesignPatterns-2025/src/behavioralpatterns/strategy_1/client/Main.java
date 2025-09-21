package behavioralpatterns.strategy_1.client;

import behavioralpatterns.strategy_1.concretestrategy.BubbleSort;
import behavioralpatterns.strategy_1.concretestrategy.QuickSort;
import behavioralpatterns.strategy_1.context.Sorter;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 8, 1};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sortNumbers(numbers);

        // Switch to a different strategy
        sorter.setStrategy(new QuickSort());
        sorter.sortNumbers(numbers);
    }
}
