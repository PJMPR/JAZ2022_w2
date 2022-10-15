package org.example.model.observables;

import org.example.model.Order;
import org.example.model.abstractions.IAmWaitingForAnOrder;
import org.example.model.abstractions.IPrepareMeal;
import org.example.model.abstractions.Meal;
import org.example.model.abstractions.Worker;

public class GeneralWorker<TMeal extends Meal> extends Worker<TMeal> {

    IAmWaitingForAnOrder waiter;
    IPrepareMeal<TMeal> prepareMeal;


    public GeneralWorker(IAmWaitingForAnOrder waiter, IPrepareMeal<TMeal> prepareMeal) {
        this.waiter = waiter;
        this.prepareMeal = prepareMeal;
    }

    @Override
    public TMeal prepare(Order order) {
        return this.prepareMeal.prepare(order);
    }

    @Override
    public boolean ShouldStartWork(Order meal) {
        return this.waiter.ShouldStartWork(meal);
    }
}
