package Mediator;

import ChainofResponsibility.Task;

public interface Mediator {
    void handleTask(Task task);
}