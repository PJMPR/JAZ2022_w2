package org.example.model;

import org.example.model.abstractions.Meal;
import org.example.model.abstractions.Worker;

public class ChipsWorker extends Worker<Chips> {


    @Override
    public Chips prepare(Order order) {

        return new Chips();
    }

    @Override
    public boolean ShouldStartWork(Order order) {
        return order.isChipsIncluded();
    }
}
