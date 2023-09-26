package mediator;

public class Accelerator implements Colleague {
    private Mediator mediator;
    private boolean enabled;

    public Accelerator() {
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

    public void acceleratorPressed() {
        this.enabled = true;
        mediator.colleaguesChanged();
    }
}
