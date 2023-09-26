package mediator;

public class CarDeparture implements Mediator {
    private Accelerator accelerator;
    private GearShift gearShift;
    private HandBrake handBrake;
    private Engine engine;

    public CarDeparture(Accelerator accelerator, GearShift gearShift, HandBrake handBrake, Engine engine) {
        this.accelerator = accelerator;
        this.gearShift = gearShift;
        this.handBrake = handBrake;
        this.engine = engine;
        createColleagues();
    }

    public void createColleagues() {
        accelerator.setMediator(this);
        gearShift.setMediator(this);
        handBrake.setMediator(this);
        engine.setMediator(this);
    }

    public void colleaguesChanged() {
        if (!engine.isEnabled()) {
            System.out.println("You should start the engine first.");
            accelerator.setColleagueEnabled(false);
            gearShift.setColleagueEnabled(false);
            handBrake.setColleagueEnabled(false);
        } else if (!handBrake.isEnabled() || !gearShift.isEnabled() || !accelerator.isEnabled()) {
            System.out.println("You still have something to do.");
            accelerator.setColleagueEnabled(false);
        } else {
            System.out.println("You can depart now.");
        }
    }
    public void isReadyToDepart() {
        if (accelerator.isEnabled() && gearShift.isEnabled() && handBrake.isEnabled() && engine.isEnabled()) {
            System.out.println("Car is ready to depart.");
        } else if (!accelerator.isEnabled()) {
            System.out.println("Accelerator is not pressed.");
        } else if (!gearShift.isEnabled()) {
            System.out.println("Gear shift is not in drive.");
        } else if (!handBrake.isEnabled()) {
            System.out.println("Hand brake is not released.");
        } else if (!engine.isEnabled()) {
            System.out.println("Engine is not started.");
        }
    }
}
