package ChainofResponsibility;

public class MediumPriorityHandler extends Handler {
    @Override
    public void handle(Task task) {
        if (Priority.MEDIUM.equals(task.getPriority())) {
            System.out.println("Medium priority handler: " + task.getDescription());
        } else {
            super.handle(task);
        }
    }
}
