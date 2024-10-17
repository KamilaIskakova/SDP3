package Command;

import ChainofResponsibility.Priority;
import ChainofResponsibility.Task;
import Mediator.Mediator;

public class HighPriorityCommand implements Command {
    private Mediator mediator;

    public HighPriorityCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(String taskDescription) {
        Task highPriorityTask = new Task(Priority.HIGH, taskDescription);
        mediator.handleTask(highPriorityTask);
    }
}
