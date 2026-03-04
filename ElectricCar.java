public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        // TODO: Set batteryPercent to 100.0
        super(model);
        batteryPercent = 100;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        // TODO: Call super.drive() 
        // TODO: Calculate battery loss
        if (batteryPercent > 0)
        {
            super.drive(distance);

            if(engineIsRunning())
                batteryPercent -= distance/5.0;
        }

        if (batteryPercent < 0)
            batteryPercent = 0;
    }

    public boolean needsCharge(){
        return batteryPercent < 50;
    }

    public double getBattery(){
        return batteryPercent;
    }
    public void charge() {
        batteryPercent = 100.0;
    }
}
