package T1;

public abstract  class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void pedalToTheMetal(){
        if(currentSpeed<maxSpeed)
            accelerate();
    }
}
