package mediator;

public class GearShift implements Colleague {
    private Mediator mediator;
    private boolean enabled;

    public GearShift() {
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

    public void gearShiftChangedToDrive() {
        this.enabled = true;
        mediator.colleaguesChanged();
    }
}
