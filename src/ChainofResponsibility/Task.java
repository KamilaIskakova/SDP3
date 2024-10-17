package ChainofResponsibility;

public class Task {
    private Priority priority;
    private String description;

    public Task(String description) {
        this.priority = Priority.LOW;
        this.description = description;
    }

    public Task(Priority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
