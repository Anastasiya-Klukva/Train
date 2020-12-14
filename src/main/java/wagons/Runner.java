package wagons;

import type.PassengerWagonTypes;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Wagon> wagons = Arrays.asList(
            new BaggageWagon(25, "backpacks and suitcases"),
            new PassengersWagon(10, "Adults with children", PassengerWagonTypes.COMMON_WAGON),
            new PassengersWagon(15, "Pensioners with pets", PassengerWagonTypes.SLEEP_WAGON)
    );
    private static Object WagonTrain;

    public static void main(String[] args) {
        Train train = new Train(wagons);
        List<BaggageWagon> baggageTrain = train.getBaggageList();
        List <PassengersWagon> passengersTrain = train.getPassengersList();
        train.sortByQuantity();
        List<Wagon> wagons1 = train.getWagons();
        for (Wagon wagon : wagons1) {
            System.out.println(wagon.toString());
        }
        System.out.println(" Total quantity of baggage and passengers: " + train.countTotalQuantity());
    }
}
