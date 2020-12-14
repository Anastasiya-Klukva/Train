//Транспорт. Определить иерархию подвижного состава железнодорожного транспорта.
// Создать пассажирский поезд. Подсчитать общую численность пассажиров и багажа.
// Провести сортировку вагонов поезда на основе уровня комфортности.
// Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.

package wagons;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Wagon> wagons;

    public Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }
    public List<BaggageWagon> getBaggageList(){
        List<BaggageWagon> arrayList = new ArrayList<>();
        for (Wagon wagon : this.wagons) {
            if (wagon instanceof BaggageWagon) {
           arrayList.add((BaggageWagon) wagon);
            }
        }
        return arrayList;
    }
    public List<PassengersWagon> getPassengersList(){
        List<PassengersWagon> arrayList = new ArrayList<>();
        for (Wagon wagon : this.wagons) {
            if (wagon instanceof PassengersWagon) {
                arrayList.add((PassengersWagon) wagon);
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
            count += wagon.getUnitQuantity();
        }
        return count;

    }
}

