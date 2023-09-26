package mediator;

public class Driver {
    private Engine engine;
    private Accelerator accelerator;
    private HandBrake handBrake;
    private GearShift gearShift;
    private CarDeparture departure;
    public Driver() {
        engine = new Engine();
        accelerator = new Accelerator();
        handBrake = new HandBrake();
        gearShift = new GearShift();
        departure = new CarDeparture(accelerator, gearShift, handBrake, engine);
    }
    public void failToDepart() {
        System.out.println("Driver fail pattern.");
        accelerator.acceleratorPressed();
        engine.engineStarted();
        handBrake.handBrakeReleased();
        gearShift.gearShiftChangedToDrive();
        departure.isReadyToDepart();
    }
    public void succeedToDepart() {
        System.out.println("Driver success pattern.");
        engine.engineStarted();
        handBrake.handBrakeReleased();
        gearShift.gearShiftChangedToDrive();
        accelerator.acceleratorPressed();
        departure.isReadyToDepart();
    }
}
