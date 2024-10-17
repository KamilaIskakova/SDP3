package Command;

public class TaskInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(String taskDescription) {
        if (this.command != null) {
            this.command.execute(taskDescription);
        }
    }
}
