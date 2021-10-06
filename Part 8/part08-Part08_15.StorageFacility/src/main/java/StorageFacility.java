import java.util.*;
public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if(!(storage.containsKey(unit))) {
            storage.put(unit, new ArrayList<String>());
        }

        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<String>());
    }

    public void remove(String storageUnit, String item) {
        if(storage.containsKey(storageUnit)) {
            if(storage.get(storageUnit).contains(item)) {
                storage.get(storageUnit).remove(item);

                if(storage.get(storageUnit).size() == 0) {
                    storage.remove(storageUnit);
                }
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for(String i: storage.keySet()) {
            if(storage.get(i).size() > 0) {
                units.add(i);
            }
        }

        return units;
    }


}
