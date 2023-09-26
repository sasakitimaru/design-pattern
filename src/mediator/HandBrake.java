package mediator;

public class HandBrake implements Colleague {
    private Mediator mediator;
    private boolean enabled;

    public HandBrake() {
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

    public void handBrakeReleased() {
        this.enabled = true;
        mediator.colleaguesChanged();
    }
}
