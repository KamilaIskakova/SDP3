import ChainofResponsibility.*;
import Command.*;
import Iterator.*;
import Mediator.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new TaskMediator();

        Command lowCommand = new LowPriorityCommand(mediator);
        Command mediumCommand = new MediumPriorityCommand(mediator);
        Command highCommand = new HighPriorityCommand(mediator);

        TaskInvoker invoker = new TaskInvoker();

        TaskList taskList = new TaskList();
        for (int i = 0; i < 10; i++) {
            taskList.addTask(new Task((i + 1) + " task description"));
        }

        TaskIterator lowIterator = taskList.iterator();
        invoker.setCommand(lowCommand);
        while (lowIterator.hasNext()) {
            invoker.execute(lowIterator.next().getDescription());
        }

        TaskIterator mediumIterator = taskList.iterator();
        invoker.setCommand(mediumCommand);
        while (mediumIterator.hasNext()) {
            invoker.execute(mediumIterator.next().getDescription());
        }

        TaskIterator highIterator = taskList.iterator();
        invoker.setCommand(highCommand);
        while (highIterator.hasNext()) {
            invoker.execute(highIterator.next().getDescription());
        }
    }
}
