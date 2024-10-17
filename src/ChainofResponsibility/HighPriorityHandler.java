package ChainofResponsibility;

public class HighPriorityHandler extends Handler {
    @Override
    public void handle(Task task) {
        if (Priority.HIGH.equals(task.getPriority())) {
            System.out.println("High priority handler: " + task.getDescription());
        } else {
            super.handle(task);
        }
    }
}
