import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(new Vehicle("F150"));
        inventory.add(new ElectricCar("Telsa"));
        
        inventory.get(1).startEngine();

        inventory.get(1).drive(375);
        
        System.out.println(((ElectricCar)inventory.get(1)).getBattery());

        System.out.println("--- End of Day Report ---");
        // TODO: Loop through inventory. 
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        for(Vehicle car: inventory)
        {
            System.out.println(car);
            if (car instanceof ElectricCar){
                if (((ElectricCar)car).needsCharge()){
                    ((ElectricCar)car).charge();
                    System.out.println(car + "\n" + ((ElectricCar)car).getBattery());
                }
            }
        }
    }
}
