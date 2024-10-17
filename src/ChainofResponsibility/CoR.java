package ChainofResponsibility;

import java.util.ArrayList;
import java.util.List;

public class CoR {
    public void showcase() {
        Handler lowPriorityHandler = new LowPriorityHandler();
        Handler mediumPriorityHandler = new MediumPriorityHandler();
        Handler highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNext(mediumPriorityHandler);
        mediumPriorityHandler.setNext(highPriorityHandler);

        List<Task> taskList = new ArrayList<>();

        taskList.add(new Task("Description of low-priority task 1"));
        taskList.add(new Task("Description of low-priority task 2"));
        taskList.add(new Task(Priority.MEDIUM, "Description of medium-priority task 1"));
        taskList.add(new Task(Priority.MEDIUM, "Description of medium-priority task 2"));
        taskList.add(new Task(Priority.HIGH, "Description of high-priority task 1"));
        taskList.add(new Task(Priority.HIGH, "Description of high-priority task 2"));

        for (Task task : taskList) {
            lowPriorityHandler.handle(task);
        }
    }
}
