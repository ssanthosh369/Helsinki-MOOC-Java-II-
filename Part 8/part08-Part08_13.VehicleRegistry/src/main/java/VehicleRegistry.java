import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(vehicles.containsKey(licensePlate)) {
            return false;
        }else {
            vehicles.put(licensePlate,owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return vehicles.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if(vehicles.containsKey(licensePlate)) {
            vehicles.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate i: vehicles.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for(String i: vehicles.values()) {
            if(!(printed.contains(i))) {
                System.out.println(i);
                printed.add(i);
            }
        }
    }


}
