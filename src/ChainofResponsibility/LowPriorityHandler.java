package ChainofResponsibility;

public class LowPriorityHandler extends Handler {
    @Override
    public void handle(Task task) {
        if (Priority.LOW.equals(task.getPriority())) {
            System.out.println("Low priority handler: " + task.getDescription());
        } else {
            super.handle(task);
        }
    }
}
