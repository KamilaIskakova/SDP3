package Iterator;

import ChainofResponsibility.Task;

import java.util.List;

public class TaskListIterator implements TaskIterator {
    private List<Task> tasks;
    private int position = 0;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        if (hasNext()) {
            return tasks.get(position++);
        }
        return null;
    }
}
