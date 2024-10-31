public abstract class GameAction {
    public final void executeAction() {
        initialize();
        performAction();
        conclude();
    }

    protected abstract void performAction();

    private void initialize() {
        System.out.println("Initializing action...");
    }

    private void conclude() {
        System.out.println("Ending action...");
    }
}

