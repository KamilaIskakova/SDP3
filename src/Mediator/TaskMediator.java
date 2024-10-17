package Mediator;

import ChainofResponsibility.*;

public class TaskMediator implements Mediator {
    private Handler lowHandler;
    private Handler mediumHandler;
    private Handler highHandler;

    public TaskMediator() {
        lowHandler = new LowPriorityHandler();
        mediumHandler = new MediumPriorityHandler();
        highHandler = new HighPriorityHandler();

        lowHandler.setNext(mediumHandler);
        mediumHandler.setNext(highHandler);
    }

    @Override
    public void handleTask(Task task) {
        if (task != null) {
            lowHandler.handle(task);
        }
    }
}

