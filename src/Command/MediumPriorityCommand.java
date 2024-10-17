package Command;

import ChainofResponsibility.Priority;
import ChainofResponsibility.Task;
import Mediator.Mediator;
public class MediumPriorityCommand implements Command {
    private Mediator mediator;

    public MediumPriorityCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(String taskDescription) {
        Task mediumPriorityTask = new Task(Priority.MEDIUM, taskDescription);
        mediator.handleTask(mediumPriorityTask);
    }
}
