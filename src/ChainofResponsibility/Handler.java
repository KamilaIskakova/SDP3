package ChainofResponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public void handle(Task task) {
        if (this.nextHandler != null) {
            this.nextHandler.handle(task);
        }
    }

    public Handler setNext(Handler next) {
        this.nextHandler = next;
        return next;
    }
}
