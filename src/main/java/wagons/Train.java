package wagons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Train {
    private List<Wagon> wagons;

    public Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }
    public List<Baggage> getBaggageList(){
        List<Baggage> arrayList = new ArrayList<>();
        for (Wagon wagon : this.wagons) {
            if (wagon instanceof Baggage) {
           arrayList.add((Baggage) wagon);
            }
        }
        return arrayList;
    }
    public List<Passengers> getPassengersList(){
        List<Passengers> arrayList = new ArrayList<>();
        for (Wagon wagon : this.wagons) {
            if (wagon instanceof Passengers) {
                arrayList.add((Passengers) wagon);
            }
        }
        return arrayList;
    }

    public Train sortByQuantity() {
        return this;
    }
    public int countTotalQuantity() {
        int count = 0;
        for (Wagon wagon : wagons) {
            count += wagon.getQuantity();
        }
        return count;
    }
}

