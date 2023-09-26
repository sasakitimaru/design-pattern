package mediator;

public class Engine implements Colleague {
    private Mediator mediator;
    private boolean enabled;

    public Engine() {
        this.enabled = false;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void engineStarted() {
        this.enabled = true;
        mediator.colleaguesChanged();
    }
}
