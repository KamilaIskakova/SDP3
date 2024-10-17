package Command;

import ChainofResponsibility.Priority;
import ChainofResponsibility.Task;
import Mediator.Mediator;

public class LowPriorityCommand implements Command {
    private Mediator mediator;

    public LowPriorityCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(String taskDescription) {
        Task lowPriorityTask = new Task(Priority.LOW, taskDescription);
        mediator.handleTask(lowPriorityTask);
    }
}
